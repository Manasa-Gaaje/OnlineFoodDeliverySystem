package com.appfood.controller;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.appfood.model.Customer;
import com.appfood.service.CustomerJpaService;


@RestController
public class CustomerController 
{
	
	@Autowired
	private CustomerJpaService customerService;
	
	@GetMapping("/customers")
	public ArrayList<Customer> getCustomers()
	{
		return customerService.getCustomer();
	}
	
	@GetMapping("/customers/{customerId}")
	public Customer getCustomerId(@PathVariable int customerId)
	{
		return customerService.getCustomerById(customerId);
	}
	
	@PostMapping("/customers/addnewcustomer")
	public Customer addCustomer(@RequestBody Customer customer)
	{
		return customerService.addCustomer(customer);
	}
	
	@PutMapping("/customers/{customerId}")
	public Customer updateCustomer(@PathVariable int customerId,@RequestBody Customer customer)
	{
		return customerService.updateCustomer(customerId,customer);
	}
	
	@DeleteMapping("/customers/{customerId}")
	public void deleteCustomer(@PathVariable int customerId)
	{
		customerService.deleteCustomer(customerId);
	}
	

}
