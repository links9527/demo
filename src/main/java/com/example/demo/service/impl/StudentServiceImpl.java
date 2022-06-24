package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.bean.Student;
import com.example.demo.dao.StudentMapper;
import com.example.demo.service.StudentService;

@Transactional
@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	public StudentMapper dao;
	
	@Override
	public List<Student> findStudentById(int id) {
		return dao.findStudentById(id);
	}

	@Override
	public List<Student> findAllStudent() {
		return dao.findAllStudent();
	}

	@Override
	public void deleteStudentById(int id) {
		dao.deleteStudentById(id);
	}

	@Override
	public void editStudentById(Student student) {
		// TODO Auto-generated method stub
		dao.editStudentById(student);
	}

	@Override
	public void insertStudent(Student student) {
		// TODO Auto-generated method stub
		dao.insertStudent(student);
	}

}
