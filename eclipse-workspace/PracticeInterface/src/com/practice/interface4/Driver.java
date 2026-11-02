package com.practice.interface4;

public class Driver {

	public static void main(String[] args) 
	{
		IBankAccount bankAccount = new SavingsAccount(5000);
		bankAccount.doSomething();
	}

}
