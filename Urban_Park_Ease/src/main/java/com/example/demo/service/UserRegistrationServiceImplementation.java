package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
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
	
	@Override
	public List<UserRegistrationmodel> getAllUsers() {
		
		return userRegRepo.findAll();
	}

	@Override
	public void deleteUserById(Long id) {
		userRegRepo.deleteById(id);
		
	}
	
	@Override
	public void saveUserLoginData(UserRegistrationmodel a) {
		userRegRepo.save(a);
		
		
	}

	@Override
	public UserRegistrationmodel findByEmail(String email) {
		 return userRegRepo.findByEmail(email);
	}

//	@Override
//	public UserRegistrationmodel findByUsername(String username) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	
	}


