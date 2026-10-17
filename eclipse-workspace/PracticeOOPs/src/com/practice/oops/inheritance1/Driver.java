package com.practice.oops.inheritance1;

public class Driver {

	public static void main(String[] args) 
	{
//		Account account = new Account();
//		
//		account.openBankAccount("Rohit", "Kolkata", "Saving");
		
		SavingAccount sAccount = new SavingAccount();
		sAccount.openSavingAccount("Amit", "Kolkata", "Savings");
		
	}

}
