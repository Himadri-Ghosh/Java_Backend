package com.practice.interface2;

public class TrainBooking implements IBooking
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
	
	public void autoUpgrade()
	{
		System.out.println("TrainBooking.autoUpgrade()......");
	}

}
