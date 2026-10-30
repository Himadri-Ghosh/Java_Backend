package com.practice.interface2;

public abstract interface IPayment 
{
	public abstract void billPayment();
	public abstract void rechargePayment();
	
	public default void offlineUPIPayment()
	{
		System.out.println("IPayment.offlineUPIPayment().......");
	}
	
}
