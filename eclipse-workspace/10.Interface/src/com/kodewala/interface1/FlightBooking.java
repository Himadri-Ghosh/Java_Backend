package com.kodewala.interface1;

public class FlightBooking implements IDiscount 
{

	@Override
	public int calculateDiscount(int amount, int rate) 
	{
		int finalFare = amount - (amount * rate) / 100;
		return finalFare;
	}
	
	
}
