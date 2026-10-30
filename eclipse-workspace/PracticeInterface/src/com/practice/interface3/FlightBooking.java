package com.practice.interface3;

public class FlightBooking implements IBooking
{

	@Override
	public void book() 
	{
		System.out.println("FlightBooking.book()........");
	}

	@Override
	public void cancelBooking() 
	{
		System.out.println("FlightBooking.cancelBooking()........");
	}

}
