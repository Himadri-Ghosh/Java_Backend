package com.practice.interface1;

public class FlightBooking implements IDiscount
{
	@Override
	public int calculateDiscount(int amount, int rate)
	{
		System.out.println("FlightBooking.calculateDiscount()......."+ MAX_NUM);
		return amount;
	}

	@Override
	public void calculateDiscountTax(int tax) {
		System.out.println("FlightBooking.calculateDiscount().......");
	}
}
