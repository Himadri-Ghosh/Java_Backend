package com.kodewala.exception4;

public class Driver {

	public static void main(String[] args) 
	{
		Driver driver = new Driver();
		int result = driver.calcDiscount(100, 10);
		System.out.println(result);
	}
	
	private int calcDiscount(int amount, int disc)
	{
		int finalAmt = 0;
		try {
			finalAmt = amount - (amount * disc / 100);
			return finalAmt; // return value has been decided here
		}catch(Exception e)
		{
			System.out.println("Some exception.....");
			e.printStackTrace();
		}finally
		{
			finalAmt = 110;
			return finalAmt; // again returning the value
		}
		
	}

}
