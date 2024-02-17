package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.AdminUser;
import com.example.demo.service.AdminService;




@Controller
public class AdminController {
	
	@Autowired
	AdminService as ;
	
    @GetMapping("/adminlogin")
	 public String adminpage(Model m) 
     {
	AdminUser ad = new AdminUser();
	    m.addAttribute("adminForm",ad);
	    
	    
		 return "Adminloginform";
	 }

   @PostMapping("/addadmindata")
   
   public String addAdmindatamethod(@ModelAttribute ("adminForm") AdminUser adminForm) 
   {
	   as.saveAdminUser(adminForm);
	   return "SuccessfulLogin";
   }

}
