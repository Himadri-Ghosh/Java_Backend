package com.practice.interface2;

public interface IPayment 
{
	public abstract void billPayment();
	public abstract void rechargePayment();
	
	public default void offlineUPIPayment()
	{
		System.out.println("IPayment.offlineUPIPayment().......");
	}
	
}
