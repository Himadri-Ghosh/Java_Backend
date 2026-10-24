package com.kodewala.oops.polymorphism2;

class Employee
{
	public void markIn()
	{
		System.out.println("Employee.marlIn()........... Employee Marking In");
	}
}

class HRManager extends Employee
{
	@Override
	public void markIn()
	{
		System.out.println("HRManager.marlIn()........... HRManager Marking In");
	}
}

public class Driver {

	public static void main(String[] args) 
	{
//		Employee e1 = new Employee();
//		e1.markIn();
		
		Employee e2 = new HRManager();  // Parent class can refer child class object
		e2.markIn(); // Same method will behave differently based on the actual object
		
		// 1. at the time of compilation, it will check the method's exist in the class Employee
		// 2. at the time of execution(while running), it will call the method on actual object
		
	}

}
