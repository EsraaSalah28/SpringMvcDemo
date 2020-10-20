package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

// need controller method to show initial form
@RequestMapping("/showForm")
public String showForm()
{
return"helloworld-form";	
}
	
// need controller method to Process form
@RequestMapping("/processForm")
public String processForm()
{
return"helloworld";	
}
// new controller method to read form data and add data to form model
@RequestMapping("/processFormVersionTwo")
public String letsShoutDude(HttpServletRequest request ,Model model )
{
	// read  request  parameter  from html form
	String theName = request.getParameter("studentName");
	//convert data to all caps 
	theName = theName.toUpperCase();
	//create the message
	String result = "YO YO !! " +theName;
	// add msg to model
	model.addAttribute("message",result);

  return"helloworld";
  
}
@RequestMapping("/processFormVersionThree")
public String processFormVersionThree(@RequestParam("studentName")String theName ,Model model )
{
	// read  request  parameter  from html form
//	String theName = request.getParameter("studentName");
	//convert data to all caps 
	theName = theName.toUpperCase();
	//create the message
	String result = " I love " +theName;
	// add msg to model
	model.addAttribute("message",result);

  return"helloworld";
  
}
}
