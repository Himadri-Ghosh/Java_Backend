package com.practice.oops.encapsulation1;

public class BankAccount 
{
	private double balance;
	
	public BankAccount(double balance)
	{
		if(balance >= 0)
		{
			this.balance = balance;
		}
	}
	
	public void deposit(int amount)
	{
		if(amount > 0)
		{
			balance += amount;
			System.out.println("Deposite Successfully");
		}
		else
		{
			System.out.println("Invalid amount!!!");
		}
		
	}
	
	public void withdraw(int amount)
	{
		if(amount <= 0)
		{
			System.out.println("Invalid amount");
		}
		else if(balance < amount)
		{
			System.out.println("Insufficient balance!!!");
		}
		else
		{
			balance -= amount;
			System.out.println("Withdraw successfully!!!");
		}
	}
	
	public double getBalance()
	{
		return balance;
	}
}
