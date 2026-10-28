package com.practice.oops.abstraction1;

public class Employee 
{
	public boolean details(String name, String address, String empID, double salary)
	{
		employeeDetails(name, address, empID);
		showSalary(salary);
		
		return true;
	}
	
	private void employeeDetails(String name, String address, String empID)
	{
		System.out.println("Employee ID : " + empID);
		System.out.println("Employee Name : " + name);
		System.out.println("Employee Address : " + address);
	}
	
	private double showSalary(double salary)
	{
		System.out.println("Salary : " + salary);
		return salary;
	}
	
	
}
