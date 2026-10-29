package com.practice.interface2;

public class CreditCardPayment implements IPayment
{

	@Override
	public void billPayment() 
	{
		System.out.println("CreditCardPayment.billPayment().......");
	}

	@Override
	public void rechargePayment() 
	{
		System.out.println("CreditCardPayment.billPayment().......");
	}

}
