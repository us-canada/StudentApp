package com.example.student.StudentApp.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.student.StudentApp.Model.Student;

public interface StudentRepository extends MongoRepository<Student, String> {


}