package com.practice.cloning;

public class Driver {

	public static void main(String[] args) throws CloneNotSupportedException 
	{
		Address address = new Address("16th line", "BTM", "Bangalore");
		
		Employee employee = new Employee("Amit", "E8253", address);
		
		Employee clonedEmp = (Employee) employee.clone();
		
		clonedEmp.address.city = "Kolkata";
		
		System.out.println(employee.address.city);
		System.out.println(clonedEmp.address.city);
	}

}
