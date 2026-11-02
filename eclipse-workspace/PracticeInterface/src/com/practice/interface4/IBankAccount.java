package com.practice.interface4;

public interface IBankAccount 
{
	public static final double MIN_BALANCE = 1000;
	
	void deposit(double amount);
	void withdraw(double amount);
	double checkBalance();
	
	public default void doSomething()
	{
		doNothing();
		System.out.println("IBankAccount.doSomething()........");
	}
	
	private void doNothing()
	{
		System.out.println("IBankAccount.doNothing()........");
	}
}
