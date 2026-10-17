package com.kodewala.oops.inheritance.multilevel;

public class SavingAccount extends Account
{
	String savingAccountNo;
	String type;
	
	SavingAccount(String name, String address, String savingAccountNo, String type)
	{
		super(name, address);
		this.savingAccountNo = savingAccountNo;
		this.type = type;
	}
	
	public void viewSavingAccount()
	{
		viewAccountDetails();
		System.out.println(savingAccountNo);
		System.out.println(type);
	}
}
