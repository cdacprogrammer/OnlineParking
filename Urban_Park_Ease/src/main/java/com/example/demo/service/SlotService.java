package com.example.demo.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Slot;

@Service
public interface SlotService {

    
//    Slot getSlotByName(Long id);
//    void bookSlot(Long id);
//    void createSlots(List<Slot> slots);
	
	
	List<Slot> createSlots(int numberOfSlots);
}