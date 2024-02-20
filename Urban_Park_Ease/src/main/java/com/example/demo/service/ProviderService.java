package com.example.demo.service;
import java.util.List;

import com.example.demo.model.ProviderModel;

public interface ProviderService {
	
	void saveProvider(ProviderModel s);

	List<ProviderModel> getAllProviders();

}


