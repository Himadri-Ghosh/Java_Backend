package com.practice.interface8;

public class Company {

	public static void main(String[] args) throws CloneNotSupportedException 
	{
		Employee1 employee1 = new Employee1("Rohit", "E2528", 55000);
		
		Employee1 emp = (Employee1) employee1.clone();
		
		System.out.println("Name : " + emp.name);
		System.out.println("Employee ID : " + emp.empID);
		System.out.println("Salary : " + emp.salary);
	}

}
