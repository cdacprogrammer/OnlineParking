package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;


public class UserController {
	
	@GetMapping("/userlogin")
    public String userlog() {
        return "UserLoginForm";
    }
}
