package com.practice.objects.instanceBlock;

class AccountMgmt2{
	AccountMgmt2()
	{
		System.out.println("Accountmgmt2.AccountMgmt2()........");
	}
}

public class Account2 extends AccountMgmt
{
	String accountNumber;
	
	{
		System.out.println("This is from instance init block");
	}
	
	Account2(String _accountNumber)
	{
		super();
		this.accountNumber = _accountNumber;
		System.out.println("Account2.Account2()");
	}
}
