package com.example.demo.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.UserService;
import com.example.demo.model.User;
@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/api/users")

public class usercontroller {
private UserService userservice;
	
	public usercontroller(UserService userservice) {
		super();
		this.userservice = userservice;
	}

	@PostMapping("/signup")
	public String saveEmployee(@RequestBody User user){
		return userservice.save(user);
				 
	}

}
