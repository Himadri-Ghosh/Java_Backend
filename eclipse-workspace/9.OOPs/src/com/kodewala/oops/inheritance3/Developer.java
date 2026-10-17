package com.kodewala.oops.inheritance3;

public class Developer extends Employee
{
	double salary;
	
	Developer(String name, String address, double salary)
	{
		super(name, address);
		this.salary = salary;
	}
	
	public void viewDeveloperDetails()
	{
		viewEmployeeDetails();
		System.out.println("Salary : " + salary);
	}
	public void work()
	{
		System.out.println("I'm working in a project.");
	}
}
