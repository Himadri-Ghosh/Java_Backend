package com.practice.string1;

public class UseFinal {
	
	class AccountMgmt   // if we use final in this class , this class cant be final
	{
		final int UPI_LIMIT = 100000;
		public final void doSomething1()
		{
			//upi = 200000;
		}
		
		public void doSomething2()
		{
			
		}
	}
	
	class Account extends AccountMgmt
	{
		public void doSomething2()
		{
			
		}
	}

	public static void main(String[] args) 
	{
		
	}

}
