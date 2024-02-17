package com.example.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.AdminUser;
import com.example.demo.repository.AdminRepository;
@Service
public class AdminserviceImplementation implements AdminService 
{
     @Autowired
	 AdminRepository ad;
  
	@Override
	public void saveAdminUser(AdminUser a) {
		ad.save(a);
		
		
	}

}
