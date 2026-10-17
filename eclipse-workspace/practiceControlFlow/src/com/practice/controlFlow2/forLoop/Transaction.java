package com.practice.controlFlow2.forLoop;

public class Transaction 
{
	public static void main(String args[])
	{
		int transactions[] = {2000, 9038, 5000, 3846, 7389, 5000, 2937};
		int n = transactions.length;
		
		int a = 0;
		
		for(int i=n-1; i>=n-6; i++)
		{
			a = transactions[i];
			System.out.println(a);
		}
	}
}
