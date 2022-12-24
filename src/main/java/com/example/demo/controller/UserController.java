package com.example.demo.controller;

import com.example.demo.dto.LoginRequest;
import com.example.demo.dto.LoginResponse;
import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.io.IOException;


@RestController
@RequestMapping("/users")
@Validated
public class UserController {
    @Autowired
    UserService userService;


    @PostMapping
    public LoginResponse loginUser(@RequestBody LoginRequest loginRequest) throws IOException {
       return userService.loginUser(loginRequest);

    }

    @PostMapping("/signup")
    public ResponseEntity<User> registerUser(@Valid @RequestBody User user) {
       User savedUser =  userService.saveUser(user);
        return new ResponseEntity<User>(savedUser, HttpStatus.CREATED);
    }
}
