package com.practice.oops.inheritance4;

public class CurrentAccount2 extends AccountDetails2
{
	String accountType;
	String accountNumber;
	double balance;
	
	CurrentAccount2(String _accountHolderName, String _accountHolderAddress, String _bankName,
			String _accountType, String _accountNumber, double _balance)
	{
		super(_accountHolderName, _accountHolderAddress, _bankName);
		this.accountType = _accountType;
		this.accountNumber = _accountNumber;
		this.balance = _balance;
	}
	
	public void deposit(double amount)
	{
		if(amount < 0)
		{
			System.err.println("Invalid amount");
		}
		else
		{
			balance += amount;
		}
	}
	
	public void withdraw(double amount)
	{
		if(amount < 0)
		{
			System.err.println("Invalid amount");
		}
		else
		{
			balance -= amount;
		}
	}
	
	public void getCurrentDetails()
	{
		showDetails();
		System.out.println("Account Type : " + accountType);
		System.out.println("Account Number : " + accountNumber);
		System.out.println("Savings Account Balance : " + balance);
	}
}
