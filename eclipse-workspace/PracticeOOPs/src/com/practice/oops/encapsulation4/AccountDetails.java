package com.practice.oops.encapsulation4;

public class AccountDetails 
{
	String accountHolder;
	String accountNumber;
	private double balance;
	
	AccountDetails(String _accountHolder, String _accountNumber, double _balance)
	{
		this.accountHolder = _accountHolder;
		this.accountNumber = _accountNumber;
		this.balance = _balance;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	void doCredit(double amount)
	{
		if(amount > 0 )
		{
			balance += amount;
		}
		else
		{
			System.out.println("Invalid amount");
		}
	}
	
	void doDebit(int amount)
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
