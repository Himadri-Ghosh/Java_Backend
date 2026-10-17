package com.practice.oops.inheritance.bank;

public class AccountDetails {
	String accountHolderName;
	String accountHolderAddress;
	String bankName;

	AccountDetails(String accountHolderName, String accountHolderAddress,String bankName) 
	{
		this.accountHolderName = accountHolderName;
		this.accountHolderAddress = accountHolderAddress;
		this.bankName = bankName;
	}
	
	public void showDetails()
	{
		System.out.println("Account Holder Name : " + accountHolderName);
		System.out.println("Account Holder Address : " + accountHolderAddress);
		System.out.println("Bank : " + bankName);
	}
}
