package com.practice.serialize.employeeData;

import java.io.Serializable;

public class EmployeeDetails implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	String name;
	String employeeID;
	int salary;
	
	EmployeeDetails(String name, String employeeID, int salary)
	{
		this.name = name;
		this.employeeID = employeeID;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}
