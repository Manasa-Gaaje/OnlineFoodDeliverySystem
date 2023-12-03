package com.appfood.jwt;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.appfood.model.Customer;
import com.appfood.repository.CustomerJpaRepository;

@Service
public class CustomerServiceImpl implements UserDetailsService
{
   @Autowired
   private CustomerJpaRepository userRepository;
   
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException 
	{
		Customer customer=userRepository.findByEmail(email);
		if(customer==null)
		{
			throw new UsernameNotFoundException("User not found",null);
		}
		return new User(customer.getEmail(),customer.getPassword(),new ArrayList<>());
	}

}
