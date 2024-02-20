package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.AdminUser;
import com.example.demo.model.UserLoginModal;
import com.example.demo.service.AdminService;
import com.example.demo.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService userService ;
	
	@GetMapping("/userlogin")
    public String userlog(Model m) 
	{
		UserLoginModal userLogin = new UserLoginModal();
		m.addAttribute("userLoginData",userLogin);
        return "UserLoginForm";
    }
	
	@GetMapping("/userlogout")
	public String userLogout(Model m) 
	{
		return "index";
		
	}
	
	
	@PostMapping("/addUserLoginData")
	   
	   public String addUserLoginData(@ModelAttribute ("userLoginData") UserLoginModal userLoginData) 
	   {
		userService.saveUserLoginData(userLoginData);
		   return "UserDashBoard";
	   }
}
