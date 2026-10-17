package com.practice.constructors1;

public class OrderDetails {
	
	String orderId;
	String customerName;
	int totalAmount;
	String delivaryAddress;
	
	OrderDetails(String _orderId, String _customerName, int _totalAmount, String _delivaryAddress){
		
		this.orderId = _orderId;
		this.customerName = _customerName;
		this.totalAmount = _totalAmount;
		this.delivaryAddress = _delivaryAddress;
		
	}

}
