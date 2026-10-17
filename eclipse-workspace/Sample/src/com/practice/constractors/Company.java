package com.practice.constractors;

public class Company {

	public static void main(String args[]) {
		
		EmployeeInfo emp1 = new EmployeeInfo("Abhi", 26, 55000, "Salt Lake, Kolkata, WB");
		EmployeeInfo emp2 = new EmployeeInfo("Raghav", 29, 72000, "Newtown, Kolkata, WB");
		
		System.out.println("--------Emplyee1---------");
		System.out.println("Name : " + emp1.name);
		System.out.println("Age : " + emp1.age);
		System.out.println("Salary : " + emp1.salary);
		System.out.println("Address : " + emp1.address);
		
		System.out.println("--------Emplyee2---------");
		System.out.println("Name : " + emp2.name);
		System.out.println("Age : " + emp2.age);
		System.out.println("Salary : " + emp2.salary);
		System.out.println("Address : " + emp2.address);
		
	}
	
}
