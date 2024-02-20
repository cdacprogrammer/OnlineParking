package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.UserRegistrationmodel;
import com.example.demo.model.ViewProfile;
@Repository
public interface ViewProfileRepository extends JpaRepository<ViewProfile,String> {

	 List<ViewProfile>FindAll();
	
}
