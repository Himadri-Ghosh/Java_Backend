package com.kodewala.oops.inheritance1;

class Employee
{
	String name = "Amit";
	String address = "Bangalore";
	
	private String empCode = "IC1234";
	
	public void markIn()
	{
		System.out.println("Marking IN :" + empCode);
	}
}

class Manager extends Employee // Manager is a Employee
{
	public void doSomething()
	{
		System.out.println(name); // using the parent class attribute
		System.out.println(address);
//		System.out.println(empCode);
		markIn(); // using the parent class method
	}
}

public class Driver {

	public static void main(String[] args) 
	{
		Manager manager = new Manager();
		manager.doSomething();
		
	}

}
