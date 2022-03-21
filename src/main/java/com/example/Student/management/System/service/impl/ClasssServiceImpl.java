package com.example.Student.management.System.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.Student.management.System.Repository.ClasssRepository;
import com.example.Student.management.System.entity.Classs;
import com.example.Student.management.System.service.ClasssService;

public class ClasssServiceImpl implements ClasssService {

	
	 @Autowired
	 private ClasssRepository cr;
	 
	 
	public ClasssServiceImpl(ClasssRepository cr) {
		super();
		this.cr = cr;
	}


	@Override
	public Classs saveClasss(Classs cs) {
		// TODO Auto-generated method stub
		return cr.save(cs);
	}


	

 

}
