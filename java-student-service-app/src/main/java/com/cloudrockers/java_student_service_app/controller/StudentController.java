package com.cloudrockers.java_student_service_app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cloudrockers.java_student_service_app.model.Student;

@RestController
public class StudentController {

	
	private ArrayList<Student> studentList = new ArrayList<Student>();
	
	@GetMapping("/")
	public List<Student> getStudents(){
		
		this.studentList.add(new Student(1, "Rahul", "Mechanical"));
		this.studentList.add(new Student(2, "Shweta", "MBA"));
		
		return this.studentList;
	}
	
}
