package com.practice.cloning2;

public class Driver {

	public static void main(String[] args) throws CloneNotSupportedException 
	{
		Address address = new Address("16th line", "BTM", "Bangalore");
		
		Employee employee = new Employee("Rohit", "E2937", address);
		
		Employee clonedEmp = (Employee) employee.clone();
		
		employee.address.city = "Kolkata";
		
		System.out.println(clonedEmp.address.city);
		System.out.println(employee.address.city);
	}

}
