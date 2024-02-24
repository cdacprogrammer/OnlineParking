package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	  
    @GetMapping("/viewUsers")
    public String ViewUsersmethod(Model m) {
    	
    	List<UserRegistrationmodel> VU = userRegService.getAllUsers();
    	m.addAttribute("ViewUserList",VU);
    	return "ViewUsers";
    }
    
    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") Long id) {
    	userRegService.deleteUserById(id);
        return "Success";
    }
	
	@PostMapping("/UserRegistrationdata")	
	public String userRegistrationmethod(@ModelAttribute ("UserRegform")UserRegistrationmodel  UserRegform) 	{
		userRegService.saveUserRegistration(UserRegform);
		return "index";
		}
	
	
}
