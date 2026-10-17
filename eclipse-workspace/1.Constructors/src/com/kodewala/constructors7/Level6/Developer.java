package com.kodewala.constructors7.Level6;

public class Developer extends Employee
{
	Developer()
	{
		this(101);
		
		System.out.println("Developer default constructor.");
	}
	
	Developer(int id)
	{
		super(id);
		System.out.println("Developer parameterized constructor.");
	}
	
	public static void main(String[] args) 
	{
		Developer d = new Developer();
	}

}
