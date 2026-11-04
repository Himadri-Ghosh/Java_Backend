package com.practice.interface8;

public class Driver2 {

	public static void main(String[] args) throws CloneNotSupportedException 
	{
		Employee employee = new Employee("E2936", "Rohit", 35000);
		
		Employee emp = (Employee) employee.clone();
		
		System.out.println(emp.name);
	}

}
