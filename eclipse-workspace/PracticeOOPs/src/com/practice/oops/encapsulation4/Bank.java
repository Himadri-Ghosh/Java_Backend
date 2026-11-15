package com.practice.oops.encapsulation4;

public class Bank {

	public static void main(String[] args) 
	{
		AccountDetails accountDetails = new AccountDetails("Rohit", "304853028", 4000);
		
		accountDetails.doCredit(500);
		accountDetails.doDebit(1000);
		
		System.out.println(accountDetails.getBalance());
	}

}
