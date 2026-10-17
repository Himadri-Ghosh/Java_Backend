package com.practice.oops.inheritance3;

public class Employee 
{
	String name;
	String address;
	double salary;
	
	public Employee(String name, String address, double salary)
	{
		super();
		this.name = name;
		this.address = address;
		this.salary = salary;
	}
	
	public void showDetails()
	{
		System.out.println("Name : " + name);
		System.out.println("Address : " + address);
		System.out.println("Salary : " + salary);
	}
}
