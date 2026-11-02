package com.practice.interface5;

public class UPIPayment implements IPayment
{
	@Override
	public void pay(double amount)
	{
		System.out.println("Paid "+ amount + " using UPIPayment");
	}
}
