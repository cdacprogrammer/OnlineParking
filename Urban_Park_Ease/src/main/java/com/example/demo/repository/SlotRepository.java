package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.ProviderModel;
import com.example.demo.model.Slot;

@Repository
public interface SlotRepository extends JpaRepository<Slot,Long>{
	// List<ProviderModel> findAll();
	// Slot findById();
}
