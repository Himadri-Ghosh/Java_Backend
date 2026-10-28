package com.kodewala.oops.abstraction1;

public class Ecommarce 
{
	public boolean orderProduct(String userName, String delivaryAddress, String phoneNo)
	{
		createAccount(userName, phoneNo);
		addAddress(delivaryAddress);
		payment();
		placeOrder();
		
		return true;
	}
	
	private boolean createAccount(String userName, String phoneNumber)
	{
		System.out.println("You have successfully create your account.");
		return true;
	}
	
	private boolean addAddress(String delivaryAddress)
	{
		System.out.println("Delivary address added.");
		return true;
	}
	
	private String payment()
	{
		System.out.println("You can pay COD");
		return "COD";
	}
	
	private void placeOrder()
	{
		System.out.println("Oredr Placed Successfully!!!");
	}
}
