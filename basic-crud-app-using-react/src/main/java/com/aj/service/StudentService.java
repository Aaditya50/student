package com.aj.service;

import java.util.List;

import com.aj.model.Student;

public interface StudentService {
	public Student saveStudent(Student student);
	public List<Student> getAll();
}
