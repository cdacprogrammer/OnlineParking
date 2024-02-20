package com.example.demo.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.demo.model.ViewProfile;

import com.example.demo.service.ViewProfileService;
@Controller
public class ViewProfileController 

{
	@Autowired
	ViewProfileService VR;
	
	@GetMapping("/VP")
    public String ViewUserProfile(Model m ) 
	{		
	        List<ViewProfile> viewProfile =VR.getAllViewProfiles();
	        m.addAttribute("ViewProfiles", viewProfile);
		        return "ViewProfile";
    }
	
	
	
}

