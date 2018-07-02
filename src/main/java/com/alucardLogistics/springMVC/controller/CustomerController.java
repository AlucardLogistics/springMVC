package com.alucardLogistics.springMVC.controller;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alucardLogistics.springMVC.model.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@InitBinder //pre-process all web requests coming into the Controller
	public void initBinder(WebDataBinder dataBinder) {	
		//StringTrimmerEditor spring API class that will trim white spaces all the way to null
		StringTrimmerEditor ste = new StringTrimmerEditor(true);
		//dataBinder will apply ste for every String.class
		dataBinder.registerCustomEditor(String.class, ste);		
	}
	
	@RequestMapping("/showForm")
	public String customerForm(Model theModel) {
		
		Customer theCustomer = new Customer();
		
		theModel.addAttribute("customer", theCustomer);
		
		System.out.println("*****customer/showForm method");
		
		return "customerForm";
	}
	
	@RequestMapping("/processForm")
	public String processForm(
			@Valid @ModelAttribute("customer") Customer theCustomer,
			BindingResult theBindingResult) { //@Valid will validate the customer object and will bind the result to the BindingResult
		//the BindingResult parameter must be immediately after the model attribute or it will be ignored
		System.out.println("*****customer object: " + theCustomer.toString());	
		if(theBindingResult.hasErrors()) {
			return "customerForm";
		} else { 	
			System.out.println("*****customer/processForm method");					
			return "customerConfirmation";
		}
	}

}
