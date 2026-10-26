package com.practice.oops.encapsulation2;

public class Bank {

	public static void main(String[] args) 
	{
		Account account = new Account("Rahul", "473927028", 4000);
		
		account.diposit(500);
		account.withdraw(1000);
		
		double balance = account.getBalance();
		
		System.out.println("Balance : " + balance);
		
	}

}
