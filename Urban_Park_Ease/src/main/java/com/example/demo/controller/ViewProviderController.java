package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.ProviderModel;
import com.example.demo.service.ProviderService;

@Controller
public class ViewProviderController {
	   @Autowired
	   ProviderService providerService;

	    @GetMapping("/viewProviders")
	    public String getUsers(Model model) {
        List<ProviderModel> viewProviders = providerService.getAllProviders();
        model.addAttribute("providers", viewProviders);
	        return "ViewProviders";
	    }
	    
	    
}
