package com.practice.interface1;

public class TrainBooking implements IDiscount
{
	@Override
	public int calculateDiscount(int amount, int rate) 
	{
		System.out.println("TrainBooking.calculateDiscount().......");
		return amount;
	}

	@Override
	public void calculateDiscountTax(int tax) 
	{
		System.out.println("TrainBooking.calculateDiscountTax().......");
	}
}
