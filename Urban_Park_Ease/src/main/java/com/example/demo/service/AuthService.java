package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.UserRegistrationmodel;
import com.example.demo.repository.IUserRegistrationRepository;

@Service
public class AuthService {

	 @Autowired
	    private IUserRegistrationRepository userRepository;

	    public boolean authenticateUser(String email, String password) {
	        UserRegistrationmodel user = userRepository.findByEmail(email);
	        return user != null && user.getPassword().equals(password);
	    }
	    
}
