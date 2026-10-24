package com.kodewala.oops.polymorphism1;

class User
{
	
}

class AdminUser extends User
{
	
}

class FinanceUser extends AdminUser
{
	
}

public class Driver {

	public static void main(String[] args) 
	{
		User u1 = new User();  // User class is reffering User class object
		AdminUser au = new AdminUser();
		
		User au1 = new AdminUser();  // Parent class can reffer child class object --> auto up-casting
		
		Object au2 = new FinanceUser();
		
		AdminUser u2 = (AdminUser) new User();  // Chils class is reffering Parent class object --> down casting
	}

}
