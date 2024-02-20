package com.example.demo.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.ProviderModel;
import com.example.demo.repository.ProviderRepository;
@Service
public class ProviderServiceImplementation implements  ProviderService 
{
	
	@Autowired
	ProviderRepository addr;

	@Override
	public void saveProvider(ProviderModel s)
	{
		addr.save(s);
		
	}
	
	 @Override
	    public List<ProviderModel> getAllProviders() {
	         return addr.findAll();
	    }
	 @Override
	 public void delete(int ProviderId) {
		 
		  ps.deleteById(ProviderId);//calling repository method 
	}
	 
}
