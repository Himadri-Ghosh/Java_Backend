package com.practice.control.flow1;

import java.util.Scanner;

public class Test1 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int luckyNumber = 20;
		int userEntered = 0;
		
		while(luckyNumber != userEntered)
		{
			System.out.println("Enter your number : ");
			userEntered = sc.nextInt();
			
			if(luckyNumber == userEntered)
			{
				System.out.println("You Won!!!");
			}
			else
			{
				System.err.println("Please try again!!!");
			}
		}
	}
}
