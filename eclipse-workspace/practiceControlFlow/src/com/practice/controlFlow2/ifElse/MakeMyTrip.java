package com.practice.controlFlow2.ifElse;

public class MakeMyTrip 
{
	public static void main(String args[])
	{
		Discount discount = new Discount();
		
		double finalPrice = discount.discountPrice(20000);
		System.out.println("Final Price is : " + finalPrice);
	}
}
