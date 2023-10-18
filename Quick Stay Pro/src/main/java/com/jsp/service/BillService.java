package com.jsp.service;

import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import com.jsp.dao.BillDao;
import com.jsp.dto.Bill;


public class BillService {  
	
	BillDao billDao=new BillDao();
	
	 public Bill saveBill(Bill bill) {
	        return billDao.saveBill(bill);
	    }

	    public Bill generateBill(String guestName, LocalDate checkInDate, LocalDate checkOutDate, double roomRate) {
	        
	        long days = Duration.between(checkInDate.atStartOfDay(), checkOutDate.atStartOfDay()).toDays();

	       	double totalAmount = roomRate * days;
	        double tax = calculateTax(totalAmount);

	        double totalAmountWithTax = totalAmount + tax;

	        Bill bill = new Bill();
	        bill.setGuestName(guestName);
	        bill.setTotalAmount(totalAmountWithTax);

	        return saveBill(bill);
	    }

	    private double calculateTax(double totalAmount) {
	      return totalAmount * 0.1; 
	    }
	}
