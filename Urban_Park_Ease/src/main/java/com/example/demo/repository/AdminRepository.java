package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.*;

public interface AdminRepository extends JpaRepository<AdminUser,String>  {

}
