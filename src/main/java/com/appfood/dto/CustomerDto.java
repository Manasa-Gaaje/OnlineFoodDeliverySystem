package com.appfood.dto;

public class CustomerDto 
{
	private Integer customerId;
	private String fullName;
	private String email;
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public CustomerDto(Integer customerId, String fullName, String email) {
		super();
		this.customerId = customerId;
		this.fullName = fullName;
		this.email = email;
	}
	public CustomerDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
