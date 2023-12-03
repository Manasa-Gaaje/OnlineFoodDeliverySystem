package com.appfood.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.appfood.dto.CustomerDto;
import com.appfood.dto.SignUpDto;
import com.appfood.service.AuthService;



@RestController
public class SignUpController 
{
	@Autowired
	private AuthService authService;
	 
	
	@PostMapping("/sign-up")
    public ResponseEntity<?> signupUser(@RequestBody SignUpDto signUpDTO) 
	{
       CustomerDto createdUser = authService.createUser(signUpDTO);
       if (createdUser == null)
       {
           return new ResponseEntity<>("User not created, come again later!", HttpStatus.BAD_REQUEST);
       }
       return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
    }

}
