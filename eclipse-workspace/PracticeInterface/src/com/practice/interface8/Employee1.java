package com.practice.interface8;

public class Employee1 implements Cloneable
{
	String name;
	String empID;
	int salary;
	
	Employee1(String name, String empID, int salary)
	{
		this.name = name;
		this.empID = empID;
		this.salary = salary;
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}
