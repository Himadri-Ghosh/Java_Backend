package com.practice.oops.encapsulation1;

public class Driver1 {

	public static void main(String[] args) 
	{
		Payment1 payment = new Payment1(3000);
		
		payment.doCredit(200);
		
		int balance = payment.getBalance();
		
		System.out.println(balance);
	}

}
