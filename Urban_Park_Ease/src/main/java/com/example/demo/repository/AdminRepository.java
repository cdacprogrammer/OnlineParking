package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.*;
@Repository
public interface AdminRepository extends JpaRepository<AddAdminRegistration,Long>  {

	AddAdminRegistration findByEmail(String email);

}
