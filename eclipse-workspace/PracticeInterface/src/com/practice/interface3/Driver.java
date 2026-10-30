package com.practice.interface3;

public class Driver {

	public static void main(String[] args) 
	{
		IBooking booking = new TrainBooking();
		booking.autoUpgrade();
	}

}
