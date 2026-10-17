package com.practice.arrays;

public class Company 
{
	public static void main(String args[])
	{
		Employee employee1 = new Employee("Rohit", "emp3983", 35000);
		Employee employee2 = new Employee("Shyam", "emp0943", 35000);
		Employee employee3 = new Employee("Abhi", "emp6383", 35000);
		Employee employee4 = new Employee("Amit", "emp0863", 35000);
		
		Employee[] employee = new Employee[4];
		
		employee[0] = employee1;
		employee[1] = employee2;
		employee[2] = employee3;
		employee[3] = employee4;
		
		for(int i=0; i<employee.length; i++)
		{
			System.out.println("Name : "+employee[i].name+"; EmployeeId : "+employee[i].employeeId+"; Salary : "+employee[i].salary);
		}

	}
}
