package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

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
	    @PostMapping("/edit/")
		public String  editproductdetails(@ModelAttribute("d1") d1)
		{
			ps.addProductDetails(d1);
			return "redirect:/listProduct";
		}
	    
	    @GetMapping("/delete/{ProviderId}")
		public String deleteProviderdata(@PathVariable int ProviderId)
		{
			ps.deleteproductdata(ProviderId);//method is inside productservice
			return "redirect:/listProduct";
		}
}
