package com.aj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aj.model.Student;
import com.aj.repository.StudentRepository;


@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	
	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);

	}


	@Override
	public Student getData(int id) {
		// TODO Auto-generated method stub
		
		return studentRepository.getById(id);
	}


	@Override
	public List<Student> getAll() {
		// TODO Auto-generated method stub
		
		return studentRepository.findAll();
	}

}
