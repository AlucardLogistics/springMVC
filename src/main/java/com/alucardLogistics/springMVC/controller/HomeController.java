package com.alucardLogistics.springMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String welcome(Model model) {
		
		System.out.println("*****Welcome method");
		
		model.addAttribute("greeting", "Welcome to Sprinb MVC app ");
		model.addAttribute("tagline", "The one and only web app for learning Spring.");
		return "main-menu";
	}

}
