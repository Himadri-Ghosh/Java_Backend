package com.practice.constructors6;

public class User 
{
	String accountHolder;
	String accountNo;
	int balance;
	
	User(String _accountHolder, String _accountNo, int _balance)
	{
		this.accountHolder = _accountHolder;
		this.accountNo = _accountNo;
		this.balance = _balance;
	}
}
