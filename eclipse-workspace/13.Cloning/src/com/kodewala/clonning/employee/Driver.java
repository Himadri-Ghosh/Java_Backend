package com.kodewala.clonning.employee;

public class Driver {

	public static void main(String[] args) throws CloneNotSupportedException 
	{
		Address address = new Address("20B cross", "BTM", "Bangalore");
		
		Employee employee = new Employee("Amit", "E2987", address);
		
		Employee clonedEmp = (Employee) employee.clone();
		
		employee.address.city = "Kolkata";
		
		System.out.println(employee.address.city);
		System.out.println(clonedEmp.address.city);
	}

}
