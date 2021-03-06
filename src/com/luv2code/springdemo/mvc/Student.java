package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {
private String firstName;
private String lastName;
private String country ;

private String [] operatingSystems;
private String favLang;

private LinkedHashMap<String,String> countryOptions;


public Student ()
{
	// populate country options :usd iso country code
	
	countryOptions= new LinkedHashMap<>();
	countryOptions.put("BR", "Brazil");
	countryOptions.put("FR", "France");
	countryOptions.put("DE", "German");
	countryOptions.put("US", "USA");
	
	
	
	}

public Student(String firstName, String lastName) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
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
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}

public LinkedHashMap<String, String> getCountryOptions() {
	return countryOptions;
}

public String[] getOperatingSystems() {
	return operatingSystems;
}

public void setOperatingSystems(String[] operatingSystems) {
	this.operatingSystems = operatingSystems;
}

public String getFavLang() {
	return favLang;
}

public void setFavLang(String favLang) {
	this.favLang = favLang;
}

}
