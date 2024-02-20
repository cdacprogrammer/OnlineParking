package com.example.demo.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.*;
@Repository
public interface ProviderRepository extends JpaRepository<ProviderModel,Long> {


	    List<ProviderModel> findAll();
	    //List<ProviderModel> findByName();
	
}
