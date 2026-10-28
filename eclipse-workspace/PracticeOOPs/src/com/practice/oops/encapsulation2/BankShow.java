package com.practice.oops.encapsulation2;

public class BankShow {

	public static void main(String[] args) 
	{
		BankAccount bankAcc = new BankAccount(5000);
		
		bankAcc.deposit(2000);
		bankAcc.withdraw(2500);
		
		double balance = bankAcc.getBalance();
		System.out.println("Balance : " + balance);
	}

}
