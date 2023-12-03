package com.appfood.dto;

public class SignUpDto 
{
	private Integer customerId;
	private String fullName;
	private String password;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public SignUpDto(Integer customerId, String fullName, String password) {
		super();
		this.customerId = customerId;
		this.fullName = fullName;
		this.password = password;
	}
	public SignUpDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getEmail() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	
}
