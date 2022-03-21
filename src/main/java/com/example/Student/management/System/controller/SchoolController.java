package com.example.Student.management.System.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Student.management.System.entity.School;
import com.example.Student.management.System.service.SchoolService;

@RestController
@RequestMapping("/api/school")
public class SchoolController {
	
	@Autowired
	private SchoolService schoolService;

	
	@PostMapping()
	public ResponseEntity<School> saveSchool(@RequestBody School school){
		 return new ResponseEntity<School>(schoolService.saveSchool(school),HttpStatus.CREATED);
	}
}
