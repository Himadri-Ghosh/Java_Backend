package com.practice.oops.inheritance4;

public class AccountDetails2 
{
	String accountHolderName;
	String accountHolderAddress;
	String bankName;
	
	AccountDetails2(String _accountHolderName, String _accountHolderAddress, String _bankName)
	{
		this.accountHolderName = _accountHolderName;
		this.accountHolderAddress = _accountHolderAddress;
		this.bankName = _bankName;
	}
	
	void showDetails()
	{
		System.out.println("Account Holder Name : " + accountHolderName);
		System.out.println("Account Holder Address : " + accountHolderAddress);
		System.out.println("Bank Name : " + bankName);
	}
}
