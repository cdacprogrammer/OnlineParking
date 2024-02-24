package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.neo4j.Neo4jProperties.Authentication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.BookingModel;
import com.example.demo.model.ProviderModel;
import com.example.demo.model.UserRegistrationmodel;
import com.example.demo.repository.IUserRegistrationRepository;
import com.example.demo.service.BookingService;
import com.example.demo.service.UserRegistrationService;

import jakarta.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookingController {

	@Autowired
	BookingService bs;
	UserRegistrationService userService;
	IUserRegistrationRepository userRepo;
	
	@GetMapping("/SlotBookingPage")
	public String Booking(Model m) 
	{
		BookingModel ad= new BookingModel();
		m.addAttribute("ConfirmSlot",ad);
		return "SlotBooking";
	}
	
	@GetMapping("/bookings")
	public String ViewBooking(Model m) 
	{
		 List<BookingModel> viewBookings = bs.getAllBookings();
	        m.addAttribute("bookingList", viewBookings);
		return "ViewBookings";
	}
	

	  @GetMapping("/deletes/{bid}")
	  public String deleteBooking(@PathVariable("bid") Long id,Model m) {
	  bs.deleteBookingById(id);
	  ViewBooking(m);
	      return "ViewBookings";
	  }
	
	@PostMapping("/BookingSlotData")
	public String AddBookingData(@ModelAttribute ("ConfirmSlot")BookingModel ConfirmSlot ) 
	{
		bs.saveBookingData(ConfirmSlot);
		return "Success";
	}
	
//	@GetMapping("/viewUserProfile")
//	public String ViewUserBooking(Model m) 
//	{
//		  // Get the currently logged-in user's authentication details
//        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//
//        // Extract the username from the authentication details
//        String email = authentication.getEmail();
//
//        // Find the user by username
//        UserRegistrationmodel user = userService.findByEmail(email);
//
//        // Pass the user to the template
//        m.addAttribute("user", user);
//
//
//		
//		return "UserBookingHistory";
//	}
	
//    @GetMapping("/viewUserProfile")
//    public ResponseEntity<UserRegistrationmodel> userProfile(HttpSession session) {
//        String email = (String) session.getAttribute("email");
//        if (email != null) {
//        	UserRegistrationmodel user = userRepo.findByEmail(email);
//            return ResponseEntity.ok(user);
//        } else {
//            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
//        }
//    }
	
	@GetMapping("/viewUserBooking")
	public String ViewUserBooking(Model m) 
	{
		return "UserBookingHistory";
	}
}
