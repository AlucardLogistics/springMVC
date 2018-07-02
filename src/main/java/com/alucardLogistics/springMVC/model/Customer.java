package com.alucardLogistics.springMVC.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.alucardLogistics.springMVC.validation.CourseCode;

public class Customer {
	
	private String firstName;
	
	@NotNull(message="last name is required")
	@Size(min=1, message=" last name is required") //custom error message
	private String lastName;
	
	@NotNull()
	@Min(value=0, message="must be greater than or equal to zero")
	@Max(value=10, message="must be less then or equal to 10")
	private Integer freePasses;
	
	@NotNull(message="postal is required")
	@Pattern(regexp="^[a-zA-Z0-9]{5}", message="only 5 chars/digits")
	private String postalCode;
	
	@CourseCode(value= {"ALUCARD", "BATZ"}, message="must start with BATZ or ALUCARD")
	private String courseCode;
	
	public Customer() {
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getFreePasses() {
		return freePasses;
	}

	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}
	

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=|" + lastName + "|, postalCode=" + postalCode
				+ ", courseCode=|" + courseCode + "|]";
	}

	

	

}
