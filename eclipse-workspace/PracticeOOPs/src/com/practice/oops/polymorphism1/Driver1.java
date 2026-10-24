package com.practice.oops.polymorphism1;

class Employee
{
	void markIn()
	{
		System.out.println("Employee.markIn()......Employee mark IN");
	}
}

class HRManager extends Employee
{
	@Override
	void markIn()
	{
		System.out.println("HRManager.markIn().......HRManager mark IN");
	}
}

public class Driver1 
{
	public static void main(String args[])
	{
//		Employee emp = new HRManager();
//		emp.markIn();
		
		HRManager hr = (HRManager) new Employee();
		
		hr.markIn();
		
	}
}
