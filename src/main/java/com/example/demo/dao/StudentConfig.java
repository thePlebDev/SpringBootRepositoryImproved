package com.example.demo.dao;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.models.Student;

@Configuration // says this class can be used by the Spring IoC container as a source of bean definitions
public class StudentConfig {

	@Bean // this function will return an object to be registered as a bean
	CommandLineRunner commandLineRunner(StudentRepository repository){
		// so CommandLineRunner runs automatically 
		return args ->{
			Student tim = new Student(
					1L,
					"Tom",
					"Tom@gmail.com",
					LocalDate.of(2000, Month.JANUARY, 5)
					);
			
			Student dave = new Student(
					"DAVE",
					"Tom@gmail.com",
					LocalDate.of(2000, Month.JANUARY, 5)
					);
			repository.saveAll(
					List.of(tim,dave)
					);
			
		};
	}
	
}
