package com.example.student.StudentApp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.student.StudentApp.Model.Student;
import com.example.student.StudentApp.service.StudentService;

@RestController
@RequestMapping("/v1")
public class StudentController {

	@Autowired
	StudentService studentService;


	@RequestMapping(value = "/student", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
	public List<Student> getStudents() {

		return studentService.getStudent();
	}
	
	
}
