package com.practice.oops.encapsulation2;

public class Company {

	public static void main(String[] args) 
	{
		Employee emp = new Employee("Rohit", 45000);
		
		emp.increaseSalary(10000);
		
		String name = emp.getName();
		double salary = emp.getSalary();
		
		System.out.println("Name : " + name);
		System.out.println("Salary : " + salary);
	}

}
