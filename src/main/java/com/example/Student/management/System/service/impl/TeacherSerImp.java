package com.example.Student.management.System.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Student.management.System.Repository.TeacherRepository;
import com.example.Student.management.System.entity.Teacher;
import com.example.Student.management.System.service.TeacherService;

@Service
public class TeacherSerImp implements  TeacherService{

	@Autowired
	private TeacherRepository Repo;

	public TeacherSerImp(TeacherRepository repo) {
		super();
		Repo = repo;
	}


	@Override
	public Teacher saveTeacher(Teacher tech) {
		// TODO Auto-generated method stub
		return Repo.save(tech);
	}
	
}
