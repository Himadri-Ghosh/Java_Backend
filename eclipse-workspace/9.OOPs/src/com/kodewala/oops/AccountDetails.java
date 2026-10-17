package com.kodewala.oops;

public class AccountDetails 
{
	String accountHolder;
	String accountNumber;
	private double balance;
	
	public AccountDetails(String accountHolder, String accountNumber, int balance) {
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
		else {
			System.out.println("Invalid amount.");
		}
		
	}
	
	public void doCredit(int amount)
	{
		if(amount > 0)
		{
			balance += amount;
		}
		else
		{
			System.out.println("Invalid amount.");
		}
	}
	
	public double getBalance()
	{
		return balance;
	}
	
}
