package com.practice.oops.encapsulation1;

public class Payment1 
{
	private int balance;
	
	public Payment1(int _balance)
	{
		super();
		this.balance = _balance;
	}
	
	//setter method
	public void doDebit(int amount)
	{
		if(amount >0 && amount <= balance)
		{
			balance -= amount;
		}
		else
		{
			System.out.println("Invalid Amount");
		}
	}
	
	//setter method
	public void doCredit(int amount)
	{
		if(amount > 0)
		{
			balance += amount;
		}
	}
	
	//getter
	public int getBalance() {
		return balance;
	}
}
