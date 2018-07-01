package com.alucardLogistics.springMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alucardLogistics.springMVC.model.Student;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		//create a new student object
		Student theStudent = new Student();		
		
		//add student object to the model
		theModel.addAttribute("student", theStudent);
		
		System.out.println("*****student/showForm method");
		
		return "studentForm";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent) {
		
		
		System.out.println("theStudent object: " + theStudent.toString());
		System.out.println("*****student/processForm method");
		
		return "studentConfirmation";		
	}

}
