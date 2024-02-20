package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.AddSlotBookingModel;
import com.example.demo.repository.AddSlotBookingRepository;

@Service
public class UserSlotBookingServiceImplementation implements UserBookingService {
	
		@Autowired
		
		AddSlotBookingRepository addd ;
		@Override
		
		public void saveSlot(AddSlotBookingModel s)
		{
			addd.save(s);
			
		}
		
//		 public List<AddSlotBookingModel> getAllSlots() {
//		         return addr.findAll();
		    }
	
