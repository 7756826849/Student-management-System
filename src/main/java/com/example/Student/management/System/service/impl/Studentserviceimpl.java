package com.example.Student.management.System.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.Student.management.System.Repository.SudentRepository;
import com.example.Student.management.System.entity.Student;
import com.example.Student.management.System.service.Studentservice;

@Service
public class Studentserviceimpl implements Studentservice {
	@Autowired
	private SudentRepository studentrepo;
	
	
	public Studentserviceimpl(SudentRepository studentrepo) {
		super();
		this.studentrepo = studentrepo;
	}




	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentrepo.findAll();
	}




	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentrepo.save(student);
	}




	@Override
	public Student getStudentById(Long Id) {
		// TODO Auto-generated method stub
		return studentrepo.findById(Id).get();
		
		
	}




	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return studentrepo.save(student);
	}




	@Override
	public void deleteStudentById(Long Id) {
		// TODO Auto-generated method stub
		studentrepo.deleteById(Id);
	}




	
}
