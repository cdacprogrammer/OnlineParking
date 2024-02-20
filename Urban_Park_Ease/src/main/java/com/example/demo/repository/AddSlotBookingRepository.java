package com.example.demo.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.model.AddSlotBookingModel;

	@Repository
	
public interface AddSlotBookingRepository extends JpaRepository<AddSlotBookingModel,String> {


//		    List<AddSlotBookingModel> findAll();

}