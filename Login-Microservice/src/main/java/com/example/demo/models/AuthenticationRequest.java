package com.example.demo.models;

import java.io.Serializable;

public class AuthenticationRequest implements Serializable {


    private String email;
    private String password;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public AuthenticationRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

  
}
