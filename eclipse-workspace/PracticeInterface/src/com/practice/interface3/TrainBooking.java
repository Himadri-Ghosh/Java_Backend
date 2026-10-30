package com.practice.interface3;

public class TrainBooking implements IBooking
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
	
	public void autoUpgrade()
	{
		System.out.println("TrainBooking.autoUpgrade");
	}
}
