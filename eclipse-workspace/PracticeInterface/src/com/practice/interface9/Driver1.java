package com.practice.interface9;

public class Driver1 {

	public static void main(String[] args) 
	{
		IDiscount discount = new FlightBooking();
		
		int result = discount.calculateDiscount(7000, 5);
		
		System.out.println(result);
	}

}
