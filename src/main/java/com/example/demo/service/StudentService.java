package com.example.demo.service;

import java.util.List;

import com.example.demo.bean.Student;

public interface StudentService {
	
	List<Student> findAllStudent();
	
	List<Student> findStudentById(int id);
	
	void deleteStudentById(int id);
	
	void editStudentById(Student student);
	
	void insertStudent(Student student);
}
