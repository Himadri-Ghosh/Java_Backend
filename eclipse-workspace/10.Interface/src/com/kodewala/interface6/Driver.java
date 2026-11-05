package com.kodewala.interface6;

public class Driver {

	public static void main(String[] args) 
	{
		User user = new User("Raju", "U2936");
		
		DataCleaner dataClean = new DataCleaner();
		
		dataClean.clean(user);
	}

}
