package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.AddProviderModel;
//import com.example.demo.repository.IAddProviderRepository;
import com.example.demo.service.AddProviderService;

@Controller
public class AddProviderController 
{
	@Autowired
	AddProviderService add;
//	IAddProviderRepository add;
	
	@GetMapping("/addProvider")
	public String addProvider(Model m) 
	{
		AddProviderModel ad= new AddProviderModel();
		m.addAttribute("Aprovidrform",ad);
		return "AddProviderform";
	}
	
	@PostMapping("/Addproviderdata")
	public String AddProviderDatamethod(@ModelAttribute ("Aprovidrform")AddProviderModel Aproviderform ) 
	{
		add.saveProvider(Aproviderform);
		return "DummyAddProvider";
	}

}
