package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.UserRegistrationmodel;
import com.example.demo.service.UserRegistrationService;
@Controller
public class UserRegistrationFormController 

{
	@Autowired
	UserRegistrationService userRegService;
	
	@GetMapping("/userreg")
    public String userRegForm(Model m ) 
	{
		
		UserRegistrationmodel userRegModal = new UserRegistrationmodel();
		m.addAttribute("UserRegform", userRegModal);
		
        return "UserRegistrationForm";
    }
	
	@PostMapping("/UserRegistrationdata")	
	public String userRegistrationmethod(@ModelAttribute ("UserRegform")UserRegistrationmodel  UserRegform) 	{
		userRegService.saveUserRegistration(UserRegform);
		return "Success";
		}
	
	
		/*
		 * @PostMapping("/UserRegistrationdata") public String
		 * handleRegistrationFormSubmission(@ModelAttribute("UserRegform")
		 * UserRegistrationmodel userRegform) { String gender = userRegform.getGender();
		 * // Do something with the gender value return "Success"; }
		 */
	
}
