package com.aj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aj.model.Student;
import com.aj.service.StudentService;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {
	@Autowired
	private StudentService studentservice;
	
	
	@PostMapping("/add")
	public String add(@RequestBody Student student) {
		studentservice.saveStudent(student);
		return "new student is added ";
	}
	
	@GetMapping("/see")
	public List<Student> display(){
		return studentservice.getAll();
	}
	
}
