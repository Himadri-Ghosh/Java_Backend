package com.practice.control.flow1;

public class ATMWithdrawal 
{
	public void cashWithdrawal(int amount, int balance)
	{
		if(amount <= 0)
		{
			System.out.println("Invalid amount.");
		}
		else if(amount > balance)
		{
			System.out.println("Insufficient Balance");
		}
		else
		{
			System.out.println("Your Wihtdrawal amount : " + amount);
			System.out.println("Remaining Balance : " + (balance - amount));
		}
	}
}
