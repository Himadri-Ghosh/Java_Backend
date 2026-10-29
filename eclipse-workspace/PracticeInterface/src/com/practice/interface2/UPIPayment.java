package com.practice.interface2;

public class UPIPayment implements IPayment
{

	@Override
	public void billPayment() 
	{
		System.out.println("UPIPayment.billPayment().......");
	}

	@Override
	public void rechargePayment() 
	{
		System.out.println("UPIPayment.billPayment().......");
	}
	
	@Override
	public void offlineUPIPayment()
	{
		System.out.println("UPIPayment.offlineUPIPayment().......");
	}
	
}
