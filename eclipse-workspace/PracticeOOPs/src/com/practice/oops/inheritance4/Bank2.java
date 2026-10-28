package com.practice.oops.inheritance4;

public class Bank2 {

	public static void main(String[] args) 
	{
//		AccountDetails2 account = new AccountDetails2("Abhi", "Kolkata", "SBI");
//		account.showDetails();
		SavingAccount2 sAccount = new SavingAccount2("Shyam", "BTM 1st Stage, Bangalore", "SBI", "Saving", "752383263", 68000);
		sAccount.deposit(3000);
		
		sAccount.getSavingsDetails();
	}

}
