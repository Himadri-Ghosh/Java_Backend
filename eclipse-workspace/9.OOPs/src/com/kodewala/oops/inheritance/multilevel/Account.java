package com.kodewala.oops.inheritance.multilevel;

public class Account 
{
	String name;
	String address;
	
	Account(String name, String address)
	{
		this.name = name;
		this.address = address;
	}
	
	public void viewAccountDetails()
	{
		System.out.println("Name : " + name);
		System.out.println("Address : " + address);
	}
}
