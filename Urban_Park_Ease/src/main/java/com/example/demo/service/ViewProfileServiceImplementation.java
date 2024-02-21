package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.ViewProfile;
import com.example.demo.repository.ViewProfileRepository;

@Service
public  class ViewProfileServiceImplementation implements ViewProfileService {

    @Autowired
    ViewProfileRepository VPR;

       @Override
      public List<ViewProfile> getAllViewProfiles(){
    	   return VPR.findAll();
       }
      
    }


