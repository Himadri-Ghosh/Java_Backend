package com.practice.oops.inheritance2;

public class Developer extends Employee
{
	double salary;
	Developer(String name, int employeeId, double salary) {
        super(name, employeeId);
        this.salary = salary;
    }

	@Override
    void work() {
        System.out.println(name + " is writing code.");
    }
	
	@Override
	void monthlySalary() {
		System.out.println(name + "'s Salary is : " + salary);
	}
}
