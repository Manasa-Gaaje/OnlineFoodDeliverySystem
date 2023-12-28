package com.appfood.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import com.appfood.model.Bill;
import com.appfood.repository.BillJpaRepository;
import com.appfood.repository.BillRepository;


@Service
public class BillJpaService implements BillRepository 
{
	@Autowired
	private BillJpaRepository billJpaRepository;
	
	@Override
	public ArrayList<Bill> getBill() 
	{
		List<Bill> billList=billJpaRepository.findAll();
		ArrayList<Bill> bills=new ArrayList<>(billList);
		return bills;
	}

	@Override
	public Bill getBillById(int billId) 
	{
		try
		{
			Bill bill=billJpaRepository.findById(billId).get();
			return bill;
		}
		catch(Exception e)
		{
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		}
		
	}
	
	@Override
	public Bill addBill(Bill bill) 
	{
		billJpaRepository.save(bill);
	      return bill;
	}

	@Override
	public Bill updateBill(int billId, Bill bill) 
	{
		try
		{
			Bill existingBill=billJpaRepository.findById(billId).get();
			if(bill.getBillDate()!=null)
			{
				existingBill.setBillDate(bill.getBillDate());
			}
			
			if(bill.getTotalItem()!=0)
			{
				existingBill.setTotalItem(bill.getTotalItem());
			}
			
			return billJpaRepository.save(existingBill);
			
			
		}
		catch(Exception e)
		{
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		}
	}
		

	@Override
	public void deleteBill(int billId) 
	{
		try
		{
			Bill bill=billJpaRepository.findById(billId).get();
			if(bill!=null)
			{
				billJpaRepository.deleteById(billId);
			}
		}
		catch(Exception e)
		{
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		}
	}
	
	
}
