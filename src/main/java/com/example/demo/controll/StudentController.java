package com.example.demo.controll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	public StudentService service;

	@GetMapping(value = { "/student/{id}", "/student" })
	public List<Student> findAllStudent(@PathVariable(value = "id", required = false) Integer id) {
		if (id == null) {
			return service.findAllStudent();
		}
		return service.findStudentById(id);
	}

	@DeleteMapping("/student/{id}")
	public void deleteStudentById(@PathVariable int id) {
		service.deleteStudentById(id);
	}

	@PutMapping("/student")
	public void editStudentById(@RequestBody Student student) {
		service.editStudentById(student);
	}

	@PostMapping("/student")
	public void insertStudent(@RequestBody Student student) {
		service.insertStudent(student);
	}

}
