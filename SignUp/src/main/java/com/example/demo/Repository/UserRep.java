package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.User;
public interface UserRep extends JpaRepository<User,String>{

}
