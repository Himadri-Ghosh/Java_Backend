package com.practice.oops.inheritance2;

public class Driver1 {

	public static void main(String[] args) 
	{
		EmployeeProcessor employeeProcessor = new EmployeeProcessor();
		
//		 Developer dev = new Developer("Amit", 101, 50000);
//		Manager manager = new Manager("Shamal", 3929, 75000);
		Tester tester = new Tester("Rohit", 1034, 35400); 
		 
		 employeeProcessor.processEmployee(tester);
		
	}

}
