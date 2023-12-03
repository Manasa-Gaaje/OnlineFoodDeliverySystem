package com.appfood.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.appfood.dto.CustomerDto;
import com.appfood.dto.SignUpDto;
import com.appfood.model.Customer;
import com.appfood.repository.CustomerJpaRepository;

public class AuthServiceImpl implements AuthService
{
	@Autowired
	private CustomerJpaRepository customerRepository;

	@Override
	public CustomerDto createUser(SignUpDto signUpDTO) 
	{
		   Customer customer = new Customer();
	       customer.setFullName(signUpDTO.getFullName());
	       customer.setEmail(signUpDTO.getEmail());
	       customer.setPassword(new BCryptPasswordEncoder().encode(signUpDTO.getPassword()));
	       Customer createdUser =customerRepository.save(customer);
	       CustomerDto customerDTO = new CustomerDto();
	       customerDTO.setCustomerId(createdUser.getCustomerId());
	       customerDTO.setEmail(createdUser.getEmail());
	       customerDTO.setFullName(createdUser.getFullName());
	       return customerDTO;
	}

}
