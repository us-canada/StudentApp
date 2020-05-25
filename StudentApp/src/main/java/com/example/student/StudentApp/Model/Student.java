package com.example.student.StudentApp.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Student {
	
	private String id;
	private String firstName;
	private String lastName;
	private Integer rollNo;
	private Integer schoolId;
	
}
