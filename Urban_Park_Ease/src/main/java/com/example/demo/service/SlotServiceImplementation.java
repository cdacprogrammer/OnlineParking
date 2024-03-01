package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.model.Slot;
import com.example.demo.repository.SlotRepository;
import java.util.List;
import java.util.Optional;


@Service
public class SlotServiceImplementation<SlotServiceImplementation> implements SlotService {

	@Autowired
     SlotRepository slotRepository;
	
	public List<Slot> createSlots(int numberOfSlots) {
        List<Slot> slots = new ArrayList<>();
        for (int i = 1; i <= numberOfSlots; i++) {
            Slot slot = new Slot("Slot " + i);
            slots.add(slot);
        }
        return slots;
    }
	
	
	
	
//    @Qualifier("slots")
//    public List<Slot> slots;
//
//    public Slot getSlot(int index) {
//        if (index < 0 || index >= slots.size()) {
//            throw new RuntimeException("Invalid slot index");
//        }
//        return slots.get(index);
//    }
//
//    public void markSlotAsBooked(int index) {
//        Slot slot = getSlot(index);
//        if (!slot.isAvailable()) {
//            throw new RuntimeException("Slot is already booked");
//        }
//        slot.setAvailable(false);
//    }
//
//    public void markSlotAsAvailable(int index) {
//        Slot slot = getSlot(index);
//        if (slot.isAvailable()) {
//            throw new RuntimeException("Slot is already available");
//        }
//        slot.setAvailable(true);
//    }

	
    
//
//    @Override
//    public Slot getSlotByName(Long id) {
//      return slotRepository.findById();
//    //	return Slot;
//    }
//
//    @Override
//    public void bookSlot(Long id) {
//    	Slot slot = slotRepository.findById();
//        if (slot != null) {
//           slot.setAvailable(false);
//           slotRepository.save(slot);
//        }
//    }
//    
//
//    @Override
//    public void createSlots(List<Slot> slots) {
//        slotRepository.saveAll(slots);
//    }
}