package com.practice.constructors3;

public class Driver {
	
	public static void main(String args[]) 
	{	
		User user = new User("Rohit", "C193", "9282547452");
		
		System.out.println("User Name : " + user.userName);
		System.out.println("User ID : " + user.userId);
		System.out.println("User Phone No. : " + user.mobile);
	}

}
