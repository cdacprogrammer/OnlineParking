package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.demo.model.AddSlotBookingModel;
import com.example.demo.service.UserBookingService;

@Controller
public class BookingSlotController {

@Autowired
	UserBookingService add;
	@GetMapping("/slotBooking")
	public String AddBooking(Model m) 
	{
		AddSlotBookingModel ad= new AddSlotBookingModel();
		m.addAttribute("ConfirmSlot",ad);
		return "BookingSlot";
	}
	
	@PostMapping("/AddBookingData")
	public String AddSlotDatamethod(@ModelAttribute ("ConfirmSlot")AddSlotBookingModel ConfirmSlot ) 
	{
		add.saveSlot(ConfirmSlot);
		return "Success";
}
}