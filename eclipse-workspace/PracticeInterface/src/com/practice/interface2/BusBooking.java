package com.practice.interface2;

public class BusBooking implements IBooking
{
	@Override
	public void book() 
	{
		System.out.println("TrainBooking.book()......");
	}

	@Override
	public void cancelBooking() 
	{
		System.out.println("TrainBooking.cancelBooking()......");		
	}

	@Override
	public void checkStatus() 
	{
		System.out.println("TrainBooking.checkStatus()......");		
	}
}
