package com.appfood.model;

import java.time.LocalDateTime;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Orderdetails")
public class Order 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="orderId")
	private int orderId;
	
	@Column(name="orderDate")
	@JsonFormat(pattern="yyyy-MM-dd")
	private LocalDateTime orderDate;
	
	@Column(name="orderStatus")
	private String orderStatus;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Bill bill;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public LocalDateTime getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDateTime orderDate) {
		this.orderDate = orderDate;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Bill getBill() {
		return bill;
	}

	public void setBill(Bill bill) {
		this.bill = bill;
	}

	public Order(int orderId, LocalDateTime orderDate, String orderStatus, Bill bill) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.orderStatus = orderStatus;
		this.bill = bill;
	}

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}