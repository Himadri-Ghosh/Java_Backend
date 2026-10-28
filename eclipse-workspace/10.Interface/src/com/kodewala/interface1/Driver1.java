package com.kodewala.interface1;

public class Driver1 {

	public static void main(String[] args) 
	{
		IDiscount discount = new FlightBooking();
//		double result = discount.calculateDiscount(6000, 5);
		
//		System.out.println(result);
		FlightBooking flight = (FlightBooking) discount;
		double result = flight.calculateDiscount(6000, 5);
		System.out.println(result);
	}

}
