package com.example.demo.service;

import com.example.demo.dto.LoginRequest;
import com.example.demo.dto.LoginResponse;
import com.example.demo.model.User;

import java.io.IOException;

public interface UserService {
	
    public User saveUser(User user);

    public LoginResponse loginUser(LoginRequest loginRequest) throws IOException;
 
}