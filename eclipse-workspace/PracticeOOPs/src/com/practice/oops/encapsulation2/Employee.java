package com.practice.oops.encapsulation2;

public class Employee 
{
	private String name;
	private double salary;
	
	Employee(String _name, double _salary)
	{
		this.name = _name;
		this.salary = _salary;
	}
	
	public void increaseSalary(int amount)
	{
		if(amount > 0)
		{
			salary += amount;
			System.out.println("Salary credited successfully!!!");
		}
		else
		{
			System.out.println("Invalid amount");
		}
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getSalary()
	{
		return salary;
	}
}
