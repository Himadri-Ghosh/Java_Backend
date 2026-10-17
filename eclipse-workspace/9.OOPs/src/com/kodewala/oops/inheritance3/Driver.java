package com.kodewala.oops.inheritance3;

class Account
{
	public void openAccount(String userId, String email)
	{
		System.out.println("Account.openAccount().....");
	}
}

class SavingAccount extends Account
{
	@Override // Changing the super class method's functionalities
	public void openAccount(String userId, String email)
	{
		System.out.println("SavingAccount.openAccount().....");
	}
}
class SrCitAccount extends Account
{
	@Override
	public void openAccount(String userId, String email)
	{
		System.out.println("SrCitAccount.openAccount().....");
	}
}
class PensionAccount extends Account
{
	@Override
	public void openAccount(String userId, String email)
	{
		System.out.println("PensionAccount.openAccount().....");
	}
}

public class Driver {

	public static void main(String[] args) 
	{
		PensionAccount pension = new PensionAccount();
		
	}

}
