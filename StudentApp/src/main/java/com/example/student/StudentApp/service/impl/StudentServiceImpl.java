package com.example.student.StudentApp.service.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.student.StudentApp.Model.Student;
import com.example.student.StudentApp.repository.StudentRepository;
import com.example.student.StudentApp.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;

	@Override
	public List<Student> getStudent() {

		return studentRepository.findAll();
	}

	@Override
	public void addStudent(Student s) {

		studentRepository.insert(s);
	}

	@Override
	public void deleteStudent(Integer rollNo) {
		studentRepository.deleteByRollNo(rollNo);
		
	}

}
