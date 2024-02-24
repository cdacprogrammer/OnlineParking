package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.UserRegistrationmodel;

@Repository
public interface IUserRegistrationRepository extends JpaRepository<UserRegistrationmodel,Long> {

	UserRegistrationmodel findByEmail(String email);

}
