package com.example.student.StudentApp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.student.StudentApp.Model.Student;

@Service
public interface StudentService {
	
	public List<Student> getStudent();
	

}
