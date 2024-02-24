package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.AddAdminRegistration;
import com.example.demo.model.UserRegistrationmodel;
import com.example.demo.service.AuthService;
import com.example.demo.service.UserRegistrationService;
import com.example.demo.service.UserService;

import jakarta.servlet.http.HttpSession;

@Controller
public class UserController {
	
	@Autowired
	UserRegistrationService userService ;


	
	@GetMapping("/userlogin")
    public String userlog(Model m) 
	{
		UserRegistrationmodel userLogin = new UserRegistrationmodel();
		m.addAttribute("userLoginData",userLogin);
        return "UserLoginForm";
    }
		
	@GetMapping("/userlogout")
	public String userLogout(Model m) 
	{
		return "index";
		
	}
	
	
	@PostMapping("/userLoginFormP")
	   
	   public String addUserLoginData(@ModelAttribute ("userLoginData") UserRegistrationmodel userLoginData, Model m) 
	   {
		UserRegistrationmodel existingUser = userService.findByEmail(userLoginData.getEmail());
		if (existingUser != null && existingUser.getPassword().equals(userLoginData.getPassword()))
        {   return "UserDashBoard"; // Redirect to dashboard
        }
        
                else {
            m.addAttribute("error", "Invalid email or password");
           return "UserLoginForm"; // Return to login form with error message
                }
		//userService.saveUserLoginData(userLoginData);
		   //return "UserDashBoard";
	   }
	
//	  @PostMapping("/userLoginFormP")
//	    public ResponseEntity<String> login(@RequestParam String email, @RequestParam String password, HttpSession session) {
//	        if (authService.authenticateUser(email, password)) {
//	            session.setAttribute("username", email);
//	            return ResponseEntity.ok("Login successful");
//	        } else {
//	            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid username or password");
//	        }
//	    }

//	    @GetMapping("/logout")
//	    public ResponseEntity<String> logout(HttpSession session) {
//	        session.invalidate();
//	        return ResponseEntity.ok("Logged out successfully");
//	    }
	
//	 @PostMapping("/login")
//	    public String login(@RequestParam("doctorid") String doctorid, @RequestParam("password") String password, HttpSession session, Model model) {
//	        Doctor doctor = doctorRepository.findByDoctoridAndPassword(doctorid, password);
//	        if (doctor != null) {
//	            session.setAttribute("DrId", doctorid);
//	            return "redirect:/DrViewProfile";
//	        } else {
//	            model.addAttribute("error", "Invalid doctorid or password");
//	            return "login";
//	        }
//	    }
	
	 @GetMapping("/viewUserProfile")
	 public String UserProfileView() {
		return null;
		 
	 }
}
