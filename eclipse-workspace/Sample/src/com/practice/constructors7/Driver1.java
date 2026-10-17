package com.practice.constructors7;

public class Driver1 
{
	public static void main(String args[])
	{
		User user = new User("Raju", "U20383", "927364398");
		
		System.out.println("User Name : " + user.userName);
		System.out.println("User ID : " + user.userId);
		System.out.println("Phone Number : " + user.mobile);
	}
}
