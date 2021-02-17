package com.example.demo.models;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class Student {
	
	@Id // unique identifier 
	@SequenceGenerator( // generating the unique sequence 
			name ="student_sequence",
			sequenceName="student_sequence",
			allocationSize = 1
			)
	@GeneratedValue( // setting the value to the sequence
			strategy = GenerationType.SEQUENCE,
			generator = "student_sequence"
			)
	private Long id;
	private String name;
	private String email;
	private Integer age;
	private LocalDate dob;
	
	public Student(){};
	
	public Student(Long id, String name,String email,LocalDate dob, Integer age){
		this.id = id;
		this.name = name;
		this.email = email;
		this.dob = dob;
		this.age = age;
	}
	
	public Student(String name,String email,LocalDate dob,Integer age) {
		this.name = name;
		this.email = email;
		this.dob = dob;
		this.age = age;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void getName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Student{" +
				"id= " + id +
				", name" + name + 
				", email= " + email +
				", dob= " + dob +
				", age=" + age +
				"}";
	}

}
