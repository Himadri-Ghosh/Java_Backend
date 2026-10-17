package com.practice.oops.inheritance.company;

public class Employee 
{
	String name;
	String empId;
	double salary;
	
	Employee(String name, String empId, double salary)
	{
		this.name = name;
		this.empId = empId;
		this.salary = salary;
	}
	
	public void displayDetails()
	{
		System.out.println("Name : " + name);
		System.out.println("Employee Id : " + empId);
		System.out.println("Salary : " + salary);
	}
	
	public void work()
	{
		System.out.println(name + "is working.");
	}
}
