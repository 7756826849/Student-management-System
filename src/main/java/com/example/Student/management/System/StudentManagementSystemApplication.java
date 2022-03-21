package com.example.Student.management.System;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Student.management.System.Repository.SudentRepository;
import com.example.Student.management.System.entity.Student;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {
//thamb taklya
	// baghital
	//jinkle
	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private SudentRepository studentrepo;
	@Override
	public void run(String... args) throws Exception {
//		Student student1=new Student("shivali","patil","shivali@gmail.com");
//		studentrepo.save(student1);
//		
//		Student student2=new Student("priyanka","more","priyanka@gmail.com");
//		studentrepo.save(student2);
//		
//		Student student3=new Student("ganga","patil","ganga@gmail.com");
//		studentrepo.save(student3);
		
	}

}
