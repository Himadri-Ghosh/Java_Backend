package com.kodewala.constructors4;

public class Driver {
	
	public static void main(String args[]) 
	{
		User user = new User("Kodewala", "U132", "927394204");
		
		System.out.println("User Name : " + user.userName);
		System.out.println("User ID : " + user.userId);
		System.out.println("User Phone No. : " + user.mobile);
	}

}
