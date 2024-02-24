package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Slot;
import com.example.demo.repository.SlotRepository;
import com.example.demo.service.SlotService;

@Controller
public class SlotController {

	
	 @Autowired
	    private SlotService slotService;

	    @GetMapping("/slots")
	    public String getSlotsForm(Model model) {
	        return "Slot";
	    }
//
//	    @PostMapping("/slots")
//	    public String createSlots(@RequestParam("numberOfSlots") int numberOfSlots, Model model) {
//	        List<Slot> slots = slotService.createSlots(numberOfSlots);
//	        model.addAttribute("slots", slots);
//	        return "Slot";
//	    }

}