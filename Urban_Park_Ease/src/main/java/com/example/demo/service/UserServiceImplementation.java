package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.UserLoginModal;
import com.example.demo.repository.UserLoginRepository;
@Service
public class UserServiceImplementation implements UserService {
	@Autowired
	 UserLoginRepository adUser;
 
	@Override
	public void saveUserLoginData(UserLoginModal a) {
		adUser.save(a);
		
		
	}
}
