package com.kodewala.constructors3;

public class Driver {
	
	public static void main(String args[]) {
		
		User user = new User("Rohit", "ID89764", "9835367282");
		
		System.out.println("User Name :" +user.userName);
		System.out.println("User ID :" +user.userId);
		System.out.println("Phone No :" +user.mobile);
		
	}

}
