package com.alucardLogistics.springMVC.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {
	
	private String[] coursePrefixes;
	
	public void initialize(CourseCode theCourseCode) {
		System.out.println("CourseCodeConstraintValidator initialize method");
		coursePrefixes = theCourseCode.value();
		
	}

	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext theConstraintValidatorContext) {
		//theCode HTML data entered by the user
		//theConstraintValidatorContext additional error messages
		System.out.println("CourseCodeConstraintValidator isValid method");
		
		boolean result = false;
		System.out.println("*****theCode is: " + theCode);
		
		if(theCode != null) { // catch null theCode
			
			for(String tempPrefix : coursePrefixes) {
				result = theCode.startsWith(tempPrefix);
				
				if(result) { //found a match
					break;
				}
			}
			
			System.out.println("*****result in if: " + result);
		} else {
			result = true;
		}
		System.out.println("*****result before exit: " + result);
		return result;
	}

}
