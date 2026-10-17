package com.practice.oops.encapsulation1;

public class Company {

	public static void main(String[] args) 
	{
		Employee employee = new Employee("Abhi", 30000);
		
		String name = employee.getName();
		employee.increaseSalary(3000);
		
		System.out.println(name);
		System.out.println(employee.getSalary());
	}

}
