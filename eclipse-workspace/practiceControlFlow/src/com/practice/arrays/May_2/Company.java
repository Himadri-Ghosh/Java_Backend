package com.practice.arrays.May_2;

public class Company {
	public static void main(String args[]) {
		Employee employee1 = new Employee("Raghav", 58000, "CSE");
		Employee employee2 = new Employee("Rohit", 90278, "CSE");
		Employee employee3 = new Employee("Pritam", 27390, "CSE");
		Employee employee4 = new Employee("Shyam", 83639, "CSE");

		Employee[] employee = new Employee[4];

		employee[0] = employee1;
		employee[1] = employee2;
		employee[2] = employee3;
		employee[3] = employee4;

		for (int i = 0; i < employee.length; i++) {
			System.out.println("Employee Name : " + employee[i].name + "; Salary : " + employee[i].salary
					+ "; Department : " + employee[i].dept);
		}
	}
}
