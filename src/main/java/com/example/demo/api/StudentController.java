package com.example.demo.api;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Student;
import com.example.demo.services.StudentServices;



@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {
	
	private StudentServices studentServices;
	
	@Autowired
	StudentController(StudentServices studentServices){
		this.studentServices = studentServices;
	}
	
	@GetMapping
	public List<Student> getStudents(){
		return studentServices.getStudents();
		
	}
	

}
