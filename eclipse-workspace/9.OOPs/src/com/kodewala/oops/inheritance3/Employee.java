package com.kodewala.oops.inheritance3;

public class Employee 
{
	String name;
	String address;
	
	Employee(String name, String address)
	{
		this.name = name;
		this.address = address;
	}
	
	public void viewEmployeeDetails()
	{
		System.out.println("Name : " + name);
		System.out.println("Address : " + address);
	}
}
