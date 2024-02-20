package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.UserLoginModal;
@Repository
public interface UserLoginRepository extends JpaRepository<UserLoginModal,String>{

}
