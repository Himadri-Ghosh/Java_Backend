package com.kodewala.oops.encapsulation1;

public class Account 
{
	private int balance;
	
	public void credit(int amount)
	{
		System.out.println("Driver.credit()......");
		
		balance += amount;
		
		showBalance();
		validatePIN("3734");
	}
	
	private void showBalance()
	{
		System.out.println("Balance : "+balance);
	}
	private void validatePIN(String pin)
	{
		System.out.println("PIN : "+pin);
	}
	
}
