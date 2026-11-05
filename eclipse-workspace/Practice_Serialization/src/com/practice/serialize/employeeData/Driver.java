package com.practice.serialize.employeeData;

import java.io.IOException;

public class Driver {

	public static void main(String[] args) throws IOException 
	{
		EmployeeSerialization employeeSerialization = new EmployeeSerialization();
		
		EmployeeDetails employeeDetails = new EmployeeDetails("Amit", "EID9263", 55000);
		
		employeeSerialization.serializeEmployee(employeeDetails);

	}

}
