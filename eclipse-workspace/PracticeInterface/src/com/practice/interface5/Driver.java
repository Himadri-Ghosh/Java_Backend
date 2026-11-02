package com.practice.interface5;

public class Driver {

	public static void main(String[] args) 
	{
		IPayment payment;
		
		payment = new UPIPayment();
		payment.pay(2500);
		
		payment = new CreditCardPayment();
		payment.pay(3600);
	}

}
