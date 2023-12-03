package com.appfood.model;

import java.time.LocalDateTime;

import org.springframework.lang.NonNull;

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
@Table(name="bill")
public class Bill 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	
	@Column(name="billId")
	private int billId;
	
	
	@Column(name="billDate")
	@JsonFormat(pattern="yyyy-MM-dd")
	private LocalDateTime billDate;
	
	@Column(name="totalItem")
	@NonNull
	private int totalItem;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Order order;

	public int getBillId() {
		return billId;
	}

	public void setBillId(int billId) {
		this.billId = billId;
	}

	public LocalDateTime getBillDate() {
		return billDate;
	}

	public void setBillDate(LocalDateTime billDate) {
		this.billDate = billDate;
	}

	public int getTotalItem() {
		return totalItem;
	}

	public void setTotalItem(int totalItem) {
		this.totalItem = totalItem;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Bill(int billId, LocalDateTime billDate, int totalItem, Order order) {
		super();
		this.billId = billId;
		this.billDate = billDate;
		this.totalItem = totalItem;
		this.order = order;
	}

	public Bill() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
	
	

	
	
	

}