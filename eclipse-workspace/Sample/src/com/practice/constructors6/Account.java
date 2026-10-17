package com.practice.constructors6;

public class Account extends User 
{
	String bankLocation;
	
	Account(String _accountHolder, String _accountNo, int _balance, String _bankLocation)
	{
		super(_accountHolder, _accountNo, _balance);
		this.bankLocation = _bankLocation;
	}
}
