package com.example.Student.management.System.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Student.management.System.Repository.SchoolRepository;
import com.example.Student.management.System.entity.School;
import com.example.Student.management.System.service.SchoolService;

@Service
public class SchoolServiceImpl implements SchoolService {
	@Autowired
	private SchoolRepository schoolrepo;
	
	

	public SchoolServiceImpl(SchoolRepository schoolrepo) {
		super();
		this.schoolrepo = schoolrepo;
	}



	@Override
	public School saveSchool(School school) {
		 return schoolrepo.save(school);
	}



	
	
	

}
