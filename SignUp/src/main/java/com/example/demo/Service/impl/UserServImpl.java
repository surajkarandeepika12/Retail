package com.example.demo.Service.impl;

import org.springframework.stereotype.Service;

import com.example.demo.Repository.UserRep;
import com.example.demo.Service.UserService;
import com.example.demo.model.User;

@Service
public class UserServImpl implements UserService {
private UserRep userep;
	

	public UserServImpl(UserRep userep) {
		super();
		this.userep = userep;
	}
	@Override
	public String save(User user) {
		if(!userep.existsById(user.getEmail())) {
			userep.save(user);
			return user.getName()+" your registration is successful";
		
		}
		else {
			System.out.println("EmailId already exists");
			return "EmailId already Exists" ;
		}
	}


}
