package com.kodewala.oops.polymorphism3;

public class Client {

	public static void main(String[] args) 
	{
		PaymentProcessor paymentProcessor = new PaymentProcessor();
		
//		CreditCardPayment creditCard = new CreditCardPayment();
		
		UPIPayment upi = new UPIPayment();
		
		paymentProcessor.processPayment(upi);
		
	}

}
