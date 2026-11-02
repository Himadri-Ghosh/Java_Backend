package com.practice.interface5;

public class CreditCardPayment implements IPayment
{
	@Override
	public void pay(double amount)
	{
		System.out.println("Paid " + amount + " using Credit Card");
	}
}
