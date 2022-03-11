package com.example.Student.management.System.service;

import java.util.List;

import com.example.Student.management.System.entity.Student;

public interface Studentservice {
	
	List<Student> getAllStudents();
	
	Student saveStudent(Student student);

	
	Student getStudentById(Long Id);
	
	Student updateStudent(Student student);
	
	void deleteStudentById(Long Id);

}
