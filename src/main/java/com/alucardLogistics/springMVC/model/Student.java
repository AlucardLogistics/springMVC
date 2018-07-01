package com.alucardLogistics.springMVC.model;

import java.util.Arrays;
import java.util.LinkedHashMap;

public class Student {
	
	private String firstName, lastName, email, country, favCode;
	
	private String[] operatingSystems;
	
	private LinkedHashMap<String, String> countryOptions;
	private LinkedHashMap<String, String> favoriteLanguageOptions;
	
	public Student() {
		
		//populate country options: used ISO country code
		countryOptions = new LinkedHashMap<>();
		
		countryOptions.put("TR", "Transilvanya");
		countryOptions.put("FR", "France");
		countryOptions.put("DE", "Germany");
		countryOptions.put("IN", "India");
		countryOptions.put("US", "United States");
		countryOptions.put("CA", "Canada");
		countryOptions.put("UK", "Great Britain");
		
		//populate coding language options
		favoriteLanguageOptions = new LinkedHashMap<>();
		
		favoriteLanguageOptions.put("Java", "Java");
		favoriteLanguageOptions.put("C#", "C#");
		favoriteLanguageOptions.put("Ruby", "Ruby");
		favoriteLanguageOptions.put("Pascal", "Pascal");
		
		
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}	

	public LinkedHashMap<String, String> getFavoriteLanguageOptions() {
		return favoriteLanguageOptions;
	}

	public String getFavCode() {
		return favCode;
	}

	public void setFavCode(String favCode) {
		this.favCode = favCode;
	}
	
	

	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", country="
				+ country + ", favCode=" + favCode + ", operatingSystems=" + Arrays.toString(operatingSystems) + "]";
	}

	

}
