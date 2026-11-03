package com.kodewala.interface5;

public class Driver {

	public static void main(String[] args) throws CloneNotSupportedException 
	{
		Account acc = new Account("Raju Kumar", "Kolkata", "443729826");
		
//		Account cloneObjOfAcc = (Account) acc.clone();  // trying to cloning(copy/xerox)
//		System.out.println(cloneObjOfAcc.accountNo);
		
		if(acc instanceof Cloneable)
		{
			System.out.println("True");
		}
		else 
		{
			System.out.println("False");
		}
		
	}

}
