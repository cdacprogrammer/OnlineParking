package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.model.Slot;
import com.example.demo.service.SlotService;
import com.example.demo.service.SlotServiceImplementation;

@Configuration
public class AppConfig {

//    @Bean
//    public Slot slot1() {
//        Slot slot = new Slot();
//        slot.setId(1L);
//        slot.setName("Slot 1");
//        slot.setAvailable(true);
//        return slot;
//    }
//
//    @Bean
//    public Slot slot2() {
//        Slot slot = new Slot();
//        slot.setId(2L);
//        slot.setName("Slot 2");
//        slot.setAvailable(true);
//        return slot;
//    }
//
//    // Add more slot beans as needed
//
//    @Bean
//    @Qualifier("slots")
//    public List<Slot> slots() {
//        return Arrays.asList(slot1(), slot2());
//    }
//
//    @Bean
//    public SlotService myService() {
//        return new SlotServiceImplementation();
//    }
}