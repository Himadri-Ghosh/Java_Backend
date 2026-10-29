package com.practice.interface2;

public class Driver1 
{
	public static void main(String args[])
	{
		IBooking booking = new TrainBooking();
		booking.autoUpgrade();
	}
}
