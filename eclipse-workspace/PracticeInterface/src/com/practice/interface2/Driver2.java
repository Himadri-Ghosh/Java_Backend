package com.practice.interface2;

public class Driver2 {

	public static void main(String[] args) 
	{
		IPayment payment = new CreditCardPayment();
		payment.offlineUPIPayment();
	}

}
