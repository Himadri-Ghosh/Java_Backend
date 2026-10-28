package com.kodewala.interface1;

public class BusBooking implements IDiscount
{

	@Override
	public int calculateDiscount(int amount, int rate) 
	{
		System.out.println("BusBooking.calculateDiscount().......");
		return 0;
	}
	
}
