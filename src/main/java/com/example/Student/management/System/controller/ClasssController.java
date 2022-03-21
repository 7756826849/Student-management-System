package com.example.Student.management.System.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Student.management.System.entity.Classs;
import com.example.Student.management.System.service.ClasssService;

@RestController
@RequestMapping("/class")

public class ClasssController {
	
		@Autowired
		private ClasssService css;

		public ClasssController(ClasssService css) {
			super();
			this.css = css;
		}
		
		@PostMapping
		public ResponseEntity<Classs> saveClasss(@RequestBody Classs cs) {
			return new ResponseEntity<Classs> (css.saveClasss(cs),HttpStatus.CREATED);
		}
	

}
