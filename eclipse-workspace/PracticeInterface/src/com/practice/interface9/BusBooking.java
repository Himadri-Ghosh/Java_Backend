package com.practice.interface9;

public class BusBooking implements IDiscount
{
	 @Override
	 public int calculateDiscount(int amount, int rate)
	 {
		 System.out.println("BusBooking.calculateDiscount().......");
		 return 0;
	 }
}
