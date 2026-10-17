package com.practice.oops.encapsulation1;

public class Account1
{
	String accountHolder;
	String accountNumber;
	private double balance;
	
	Account1(String accountHolder, String accountNumber, double balance)
	{
		super();
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public void doDebit(int amount)
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
	
	public void doCredit(int amount)
	{
		if(amount > 0)
		{
			balance += amount;
		}
	}
	
	public double getBalance()
	{
		return balance;
	}
}
