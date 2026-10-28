package com.practice.oops.abstraction1;

public class Ecommarce 
{
	public boolean orderProduct(String userName, String delivaryAddress, String phoneNo)
	{
		createAccount(userName, phoneNo);
		delivaryAddress(delivaryAddress);
		payment();
		placeOrder();
		
		return true;
	}
	
	private boolean createAccount(String userName, String phoneNo)
	{
		System.out.println("You have successfully created your account!!!");
		
		return true;
	}
	
	private boolean delivaryAddress(String delivaryAddress)
	{
		System.out.println("Delivary address added.");
		
		return true;
	}
	
	private String payment()
	{
		System.out.println("You can pay cod");
		
		return "COD";
	}
	
	private void placeOrder()
	{
		System.out.println("You placed the order successfully");
	}
}
