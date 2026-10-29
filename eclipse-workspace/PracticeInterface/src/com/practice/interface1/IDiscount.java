package com.practice.interface1;

public interface IDiscount 
{
	public static final int MAX_NUM = 29494;
	
	public abstract int calculateDiscount(int amount, int rate);
	
	void calculateDiscountTax(int tax);
}
