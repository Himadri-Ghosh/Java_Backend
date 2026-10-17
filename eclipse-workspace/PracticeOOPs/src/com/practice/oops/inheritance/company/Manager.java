package com.practice.oops.inheritance.company;

public class Manager extends Employee
{
	String department;
	
	Manager(String name, String empId, double salary, String department)
	{
		super(name, empId, salary);
		this.department = department;
	}
	
	public void conductMeeting()
	{
		System.out.println(name + " is conducting a meeting");
	}
	
	public void showDetails()
	{
		displayDetails();
		System.out.println("Department : " + department);
	}
}