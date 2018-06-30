package com.alucardLogistics.springMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	
	//controller method to show initial form	
	@RequestMapping("/showForm")
	public String showForm() {
		System.out.println("*****showForm method");
		return "helloworld-form";
	}
	
	//controller method to process the form
	@RequestMapping("/processForm")
	public String processForm() {
		System.out.println("*****processForm method");
		return "welcome";
	}

}
