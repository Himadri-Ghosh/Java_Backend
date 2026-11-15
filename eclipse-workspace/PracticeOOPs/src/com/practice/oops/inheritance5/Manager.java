package com.practice.oops.inheritance5;

public class Manager extends Employee
{
	private String empID;
	private double salary;
	
	Manager(String name, String address, String empID, double salary)
	{
		super(name, address);
		this.empID = empID;
		this.salary = salary;
	}
	
	@Override
	void work()
	{
		getDetails();
		System.out.println("Employee ID : " + empID);
		System.out.println("Employee Salary : " + salary);
		System.out.println(name + " is couducting a meeting.");
	}
}
