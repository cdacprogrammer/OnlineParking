package com.example.demo.service;
import java.util.List;

import com.example.demo.model.AddProviderModel;

public interface AddProviderService {
	
	void saveProvider(AddProviderModel s);

	List<AddProviderModel> getAllProviders();

}


