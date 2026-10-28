package com.practice.oops.encapsulation2;

public class ATM 
{
	private String pin;
	private double balance;
	
	ATM(String _pin, double _balance)
	{
		this.pin = _pin;
		this.balance = _balance;
	}
	
	public boolean validatePIN(String enteredPIN)
	{
		return this.pin == enteredPIN;
	}
	
	public double checkBalance(String enteredPIN)
	{
		if(validatePIN(enteredPIN))
		{
			return balance;
		}
		
		System.out.println("Invalid PIN!!!");
		return -1;
	}
	
	public void withdraw(String enteredPIN, double amount)
	{
		if(!validatePIN(enteredPIN))
		{
			System.out.println("Incorrect PIN!!!");
		}
		else if(amount <= 0)
		{
			System.out.println("Invalid amount!!!");
		}
		else if(amount > balance)
		{
			System.out.println("Insufficient Balance!!!");
		}
		else
		{
			balance -= amount;
			System.out.println("Please collect your cash");
		}
	}
}
