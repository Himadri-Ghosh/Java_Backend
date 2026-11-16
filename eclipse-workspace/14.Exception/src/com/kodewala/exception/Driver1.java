package com.kodewala.exception;

public class Driver1 {

	public static void main(String[] args) 
	{
	System.out.println("Driver1.main()......START");	
	
	Driver1 driver1 = new Driver1();
	
	driver1.doSomething();
	
	System.out.println("Driver1.main()......END");	
	}
	
	public void doSomething()
	{
		System.out.println("Driver1.doSomething()......START");
		
		String name = null;
		int amount = 100;
		
		try {
			System.out.println("try block starts here......."); 
//			Risky code --> code which may throw an exception
			amount = amount / 0;
			
			System.out.println(name.length());  // NullPointerException --> not handled
			System.out.println("try block ends here.......");			
		}catch(NullPointerException e)  // This can catch exception's object and its child objects
		{
			System.out.println("Name is null.......");
			e.printStackTrace();
		}
		catch(ArithmeticException e)
		{
			System.out.println("amount can not be / by 0");
			e.printStackTrace();
		}
		
		System.out.println("Driver1.doSomething()......END");	

	}

}
