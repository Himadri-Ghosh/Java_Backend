package com.practice.cloning2;

public class Employee implements Cloneable
{
	String name;
	String empId;
	Address address;
	
	Employee(String name, String empId, Address address)
	{
		this.name = name;
		this.empId = empId;
		this.address = address;
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		Employee e = (Employee) super.clone();
		e.address = (Address) address.clone();
		return e;
	}
}
