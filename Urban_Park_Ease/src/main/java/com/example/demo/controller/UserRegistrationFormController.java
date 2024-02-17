package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

public class UserRegistrationFormController {
	
	@GetMapping("/userreg")
    public String userRegForm() {
        return "UserRegistrationForm";
    }
	
}
