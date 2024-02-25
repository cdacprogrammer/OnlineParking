package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

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
	    public String getProviders(Model model) {
        List<ProviderModel> viewProviders = providerService.getAllProviders();
        model.addAttribute("providers", viewProviders);
	        return "ViewProviders";
	    }
	    

		  @GetMapping("/deleteProvider/{id}")
		  public String deleteBooking(@PathVariable("id") Long id,Model m) {
	      providerService.deleteProviderById(id);
	      getProviders(m);
		      return "ViewProviders";
		  }
	    
		  @GetMapping("/viewProviderForBooking")
		  public String getProvidersForUser(Model m) {
			  List<ProviderModel> viewProvidersForUser = providerService.getAllProviders();
		        m.addAttribute("providersForUser", viewProvidersForUser);
			  return "UserProviderList";
		  }
		  
		  @GetMapping("/addProvider")
			public String addProvider(Model m) 
			{
				ProviderModel ad= new ProviderModel();
				m.addAttribute("Aprovidrform",ad);
				return "AddProviderform";
			}
			

			
			@PostMapping("/Addproviderdata") 
			public String AddProviderDatamethod(@ModelAttribute ("Aprovidrform")ProviderModel Aproviderform, Model m )
			{ 
				providerService.saveProvider(Aproviderform); 
				getProviders(m);
//			 List<Slot> slots = slotService.createSlots(Aproviderform.getSlotCapacity());
//		    m.addAttribute("slots", slots);
		    return "ViewProviders";
			}
		 
}
