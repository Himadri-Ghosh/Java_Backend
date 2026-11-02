package com.practice.interface4;

public class SavingsAccount implements IBankAccount
{
	private double balance;
	
	public SavingsAccount(double balance)
	{
		this.balance = balance;
	}

	@Override
	public void deposit(double amount) 
	{
		balance += amount;
		System.out.println("Deposited "+amount+" in Savings Account. New Balance : " + balance);
	}

	@Override
	public void withdraw(double amount) 
	{
		if(balance - amount >= MIN_BALANCE)
		{
			balance -= amount;
			System.out.println("Withdrawn "+amount+" from Savings Account. New Balance : " + balance);
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
	
	@Override
	public void doSomething()
	{
//		System.out.println("SavingsAccount.doSomething.........default method");
	}

}
