package com.practice.oops.inheritance2;

public class Manager extends Employee
{
	double salary;
	
	Manager(String name, int employeeId, double salary) {
        super(name, employeeId);
        this.salary = salary;
    }

	@Override
    void work() {
        System.out.println(name + " is managing a team.");
    }
	
	@Override
	void monthlySalary() {
		System.out.println(name + "'s Salary is : " + salary);
	}
}
