package com.practice.serialization.employeeData;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.practice.serialize.employeeData.EmployeeDetails;

public class Driver {

	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\HP\\Documents\\Kodewala Academy\\Programs\\eclipse-workspace\\Practice_Serialization\\employee1.ser");
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		EmployeeDetails employee = (EmployeeDetails) ois.readObject();
		
		System.out.println("Name : " + employee.getName());
		System.out.println("Employee Id : " + employee.getEmployeeID());
		System.out.println("Salary : " + employee.getSalary());
	}

}
