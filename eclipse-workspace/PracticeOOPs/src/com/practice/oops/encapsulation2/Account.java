package com.practice.oops.encapsulation2;

public class Account 
{
	String name;
	String accountNumber;
	private double balance;
	
	public Account(String _name, String _accountNumber, double _balance)
	{
		this.name = _name;
		this.accountNumber = _accountNumber;
		if(_balance > 0)
		{
			this.balance = _balance;
		}
	}
	
	double getBalance()
	{
		return balance;
	}
	
	void diposit(double amount)
	{
		if(amount > 0)
		{
			balance += amount;
		}
		else
		{
			System.out.println("Invalid amount");
		}
	}
	
	void withdraw(double amount)
	{
		if(amount > 0 && amount <= balance)
		{
			balance -= amount;
		}
		else
		{
			System.out.println("Invalid amount");
		}
	}	
	
}
