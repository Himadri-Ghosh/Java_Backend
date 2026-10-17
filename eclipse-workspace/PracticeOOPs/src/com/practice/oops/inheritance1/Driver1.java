package com.practice.oops.inheritance1;

public class Driver1 {
	
	class Employee
	{
		String name = "Raj";
		String address = "Newtown";
		
		private String empCode = "EMP293";
		
		public void markIn()
		{
			System.out.println("Mark IN : " + empCode);
		}
		
	}
	
	class Manager extends Employee
	{
		public void doSomething() {
			System.out.println(name);
			System.out.println(address);
			markIn();
		}
	}

	public static void main(String[] args) 
	{
		Driver1 d = new Driver1();
		
		Manager mg = d.new Manager();
		
		mg.doSomething();
		
	}

}
