package com.practice.constructors6;

public class Bank 
{
	public static void main(String args[])
	{
		Account account  = new Account("Shyam", "393747893903", 84000, "Newtown, Kolkata");
		
		System.out.println("Account Holder : " + account.accountHolder);
		System.out.println("Account Number : " + account.accountNo);
		System.out.println("Balance : " + account.balance);
		System.out.println("Bank Location : " + account.bankLocation);
	}
}
