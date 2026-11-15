package com.practice.oops.encapsulation4;

public class Driver1 {

	public static void main(String[] args) 
	{
		Payment payment = new Payment("Raju", "INV2037", 5400);
		
		payment.amountCredited(500);
		
		System.out.println(payment.getPayableAmount());
		
		payment.amountDebited(1000);
		System.out.println(payment.getPayableAmount());
	}

}
