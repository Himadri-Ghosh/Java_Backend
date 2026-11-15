package com.kodewala.clonning.employee2;

public class Driver {
	
	Address address;
	Employee employee;
	Employee clonedEmp;
	
	public void doSomething() throws CloneNotSupportedException
	{
		address = new Address("20B cross", "BTM", "Bangalore");
		
		employee = new Employee("Amit", "E2987", address);
		
		clonedEmp = (Employee) employee.clone();
		
		employee.address.city = "Kolkata";
		
		System.out.println(employee.address.city);
		System.out.println(clonedEmp.address.city);
		
		
		 employee = null;  
//		 address = null;
		 
			System.out.println(employee.address.city);
		
		// 500 lines more........
	}

	public static void main(String[] args) throws CloneNotSupportedException
	{
		Driver driver = new Driver();
		driver.doSomething();
	}

}
