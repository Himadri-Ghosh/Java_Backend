package com.practice.serialize.employeeData;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EmployeeSerialization 
{
	public void serializeEmployee(EmployeeDetails employeeDetails) throws IOException
	{
		FileOutputStream fos = new FileOutputStream("employee1.ser");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(employeeDetails);
		
		oos.close();
	}
}
