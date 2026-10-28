package com.practice.oops.inheritance4;

public class SavingAccount extends Account
{
	void openSavingAccount(String name, String accountNo, String type)
	{
		System.out.println("SavingAccount.openSavingAccount().............");
		openAccount(name, accountNo, type);
	}
}
