package com.example.Student.management.System.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Student.management.System.entity.Teacher;
import com.example.Student.management.System.service.TeacherService;

@RestController
@RequestMapping("/tech")
public class TeacherController {

	@Autowired
	private TeacherService ser;

	public TeacherController(TeacherService ser) {
		super();
		this.ser = ser;
	}
	
	@PostMapping("/save")
	public ResponseEntity<Teacher> saveTeacher(@RequestBody Teacher teacher){
		
		return new ResponseEntity<Teacher>(ser.saveTeacher(teacher), HttpStatus.OK);
	}
}
