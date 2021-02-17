package com.example.demo.api;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Student;
import com.example.demo.services.StudentServices;



@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {
	
	private final StudentServices studentServices;
	
	@Autowired
	StudentController(StudentServices studentServices){
		this.studentServices = studentServices;
	}
	
	@GetMapping
	public List<Student> getStudents(){
		return studentServices.getStudents();
		
	}
	
	@PostMapping
	public void registerNewStudent(@RequestBody Student student) {
		studentServices.addNewStudent(student);
	}
	
	@DeleteMapping(path = "{studentId")
	public void deleteStudent(@PathVariable("studentId") Long studentId) {
		studentServices.deleteStudent(studentId);
	}
	

}
