package com.practice.interface8;

public class Student 
{
	String name;
	String address;
	int roll;
	
	Student(String name, String address, int roll)
	{
		this.name = name;
		this.address = address;
		this.roll = roll;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}
