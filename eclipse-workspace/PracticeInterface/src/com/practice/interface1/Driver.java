package com.practice.interface1;

public class Driver {

	public static void main(String[] args) 
	{
//		FlightBooking flight = new FlightBooking();
		
		IDiscount discount = new FlightBooking();
		
		FlightBooking flight = (FlightBooking) discount;
		
		int result = flight.calculateDiscount(4000, 6);
		System.out.println(result);
	}

}
