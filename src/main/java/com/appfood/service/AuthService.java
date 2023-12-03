package com.appfood.service;

import com.appfood.dto.CustomerDto;
import com.appfood.dto.SignUpDto;



public interface AuthService 
{
	CustomerDto createUser(SignUpDto signUpDTO);


}
