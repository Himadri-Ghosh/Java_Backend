package com.practice.interface8;

public class Employee implements Cloneable
{
	String empID;
	String name;
	int salary;
	
	Employee(String empID, String name, int salary)
	{
		this.empID = empID;
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}
