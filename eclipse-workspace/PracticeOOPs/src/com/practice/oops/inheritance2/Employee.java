package com.practice.oops.inheritance2;

public class Employee 
{
	String name;
    int employeeId;

    Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
    }
    
    void work()
    {
    	System.out.println("They work in our company");
    }
    
	void monthlySalary() {
		System.out.println("Salary......");
	}
}
