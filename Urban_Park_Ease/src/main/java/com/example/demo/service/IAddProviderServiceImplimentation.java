package com.example.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.AddProviderModel;
import com.example.demo.repository.IAddProviderRepository;
@Service
public class IAddProviderServiceImplimentation implements  AddProviderService 
{
	
	@Autowired
	IAddProviderRepository addr;

	@Override
	public void saveProvider(AddProviderModel s)
	{
		addr.save(s);
		
	}
}
