package com.practice.oops.inheritance.company;

public class Company {

	public static void main(String[] args) 
	{
		Manager mg = new Manager("Amal", "ID3929", 25000, "History");
		mg.showDetails();
		mg.conductMeeting();
		mg.work();
		
	}

}
