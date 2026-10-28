package com.practice.oops.encapsulation2;

public class BankAccount 
{
	private double balance;
	
	public BankAccount(double balance)
	{
		if(balance > 0)
		{
			this.balance = balance;
		}
	}
	
	public void deposit(double amount)
	{
		if(amount > 0)
		{
			balance += amount;
			System.out.println("Deposit successfully");
		}
		else 
		{
			System.out.println("Invalid amount!!!");
		}
	}
	
	public void withdraw(double amount)
	{
		if(amount <= 0)
		{
			System.out.println("Invalid amount!!!");
		}
		else if(balance < amount)
		{
			System.out.println("Insufficient balance!!!");
		}
		else
		{
			balance -= amount;
		}
	}
	
	public double getBalance()
	{
		return balance;
	}
}
