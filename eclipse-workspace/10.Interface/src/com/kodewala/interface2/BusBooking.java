package com.kodewala.interface2;

public class BusBooking implements IBooking
{

	@Override
	public void book() 
	{
		System.out.println("BusBooking.book().......");
	}

	@Override
	public void cancelBooking() 
	{
		System.out.println("BusBooking.cancelBooking().......");		
	}

	@Override
	public void checkStatus() 
	{
		System.out.println("BusBooking.checkStatus().......");

	}

	
	
}
