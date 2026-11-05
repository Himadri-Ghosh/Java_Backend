package com.practice.cloning;

public class Employee implements Cloneable
{
	String name;
	String empId;
	Address address;
	
	public Employee(String name, String empId, Address address) {
		super();
		this.name = name;
		this.empId = empId;
		this.address = address;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException
	{
		Employee e = (Employee) super.clone();
		e.address = (Address) address.clone(); 
		return e;
	}
}
