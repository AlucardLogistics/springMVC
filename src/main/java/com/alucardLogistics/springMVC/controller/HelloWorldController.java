package com.alucardLogistics.springMVC.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
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
	
	//controller to read form data and add data to the model
	@RequestMapping("/processFormShout")
	public String shoutDatName(HttpServletRequest request, Model model) {
		
		//read the request parameter from the HTML from
		String theName = request.getParameter("studentName");
		
		//convert to caps
		theName = theName.toUpperCase();
		
		//create message
		String result = "Yo! " + theName + "!";
		
		//add message to the model
		model.addAttribute("message", result); // name of attr message, and value of attr result
		
		System.out.println("*****shoutDatName method");
		
		return "welcome";
	}

	
	//controller to read form data and add data to the model
	@RequestMapping("/processFormShoutTwo")
	public String shoutDatNameTwo(@RequestParam("studentName") String theName, Model model) {
		
		//convert to caps
		theName = theName.toUpperCase();
		
		//create message
		String result = "Yo! " + theName + " @RequestParam works!";
		
		//add message to the model
		model.addAttribute("message", result); // name of attr message, and value of attr result
		
		System.out.println("*****shoutDatNameTwo method");
		
		return "welcome";
	}

}
