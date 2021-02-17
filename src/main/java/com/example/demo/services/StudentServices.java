package com.example.demo.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.StudentRepository;
import com.example.demo.models.Student;

@Service
public class StudentServices {
	
	private final StudentRepository studentRepository;
	
	@Autowired
	public StudentServices(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	public List<Student> getStudents(){
		return studentRepository.findAll();
	}

	public void addNewStudent(Student student) {
		// TODO Auto-generated method stub
		System.out.println(student);
	}
}
