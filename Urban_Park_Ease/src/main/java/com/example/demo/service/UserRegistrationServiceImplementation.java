package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.ProviderModel;
import com.example.demo.model.UserRegistrationmodel;
import com.example.demo.repository.ProviderRepository;
import com.example.demo.repository.IUserRegistrationRepository;
@Service
public class UserRegistrationServiceImplementation implements UserRegistrationService {

	@Autowired
	IUserRegistrationRepository userRegRepo;
	
	@Override
	public void saveUserRegistration(UserRegistrationmodel userRegform) 
	{
		userRegRepo.save(userRegform);
	}
	}


