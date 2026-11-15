package com.practice.oops.inheritance5;

public class Employee 
{
	String name;
	String address;
	
	Employee(String name, String address)
	{
		this.name = name;
		this.address = address;
	}
	
	void work()
	{
		System.out.println(name + " is working....");
	}
	
	public void getDetails()
	{
		System.out.println("Name : " + name);
		System.out.println("Address : " + address);
	}
}
