package com.example.demo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController 
{
@GetMapping("/homepage")
public String homepage() {
	return "index";
}

@GetMapping("/userreg")
public String userRegForm() {
	return "UserRegistrationForm";
}

@GetMapping("/aboutus")
public String aboutuspage() {
	return "AboutUs";
}
 @GetMapping("/contactus")
 public String contactus() {
	 return "ContactUs";
 }
 
 @GetMapping("/userlogin")
 public String userlog() {
     return "UserLoginForm";
 }
}