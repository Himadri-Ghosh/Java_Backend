package com.kodewala.oops;

public class Bank {

	public static void main(String[] args) 
	{
		AccountDetails account = new AccountDetails("Rahul", "6372929237", 3000);
		
		account.doDebit(200);
		account.doCredit(500);
	
		double balance = account.getBalance();
		System.out.println(balance);
	}

}
