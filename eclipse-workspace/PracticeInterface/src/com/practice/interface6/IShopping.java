package com.practice.interface6;

public interface IShopping 
{
	void purchase();
	
	public default void returnItem()
	{
		System.out.println("IShopping.returnItem()........IShopping");
	}
}
