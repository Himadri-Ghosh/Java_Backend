package com.practice.interface4;

public class CurrentAccount implements IBankAccount
{
	private double balance;
	
	public CurrentAccount(double balance)
	{
		this.balance = balance;
	}

	@Override
	public void deposit(double amount) 
	{
		balance += amount;
		System.out.println("Deposited "+amount+" in  Current Account. New Balance : " + balance);
	}

	@Override
	public void withdraw(double amount) 
	{
		if(balance - amount >= MIN_BALANCE)
		{
			balance -= amount;
			System.out.println("Withdrawn "+amount+" from Current Account. New Balance : " + balance);
		}
		else
		{
			System.out.println("Insufficient Balance.");
		}
	}

	@Override
	public double checkBalance() {
		return balance;
	}
}
