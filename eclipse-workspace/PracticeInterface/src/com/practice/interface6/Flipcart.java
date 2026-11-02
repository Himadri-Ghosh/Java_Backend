package com.practice.interface6;

public class Flipcart implements IShopping
{
	@Override
	public void purchase() 
	{
		System.out.println("Flipcart.purchase()........Flipcart");
	}
	
	@Override
	public void returnItem()
	{
		System.out.println("Flipcart.returnItem().......Flipcart");
	}
}
