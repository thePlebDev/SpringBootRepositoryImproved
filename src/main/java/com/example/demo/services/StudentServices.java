package com.example.demo.services;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.models.Student;

@Service
public class StudentServices {

	public List<Student> getStudents(){
		return List.of(
				new Student(
						1L,
						"Tom",
						"Tom@tomMail.com",
						LocalDate.of(2000, Month.JANUARY, 5),
						21
						)
				);
	}
}
