package com.kodewala.oops.inheritance;

public class SavingAccount extends Account
{
	public void openSavingAccount(String name, String address, String type)
	{
//		Reusing the existing functionality
		openBankAccount(name, address, type);
	}
}
