package com.kodewala.loops3;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int luckyNumber = 13;
		int userEntered = 0;
		
		while(luckyNumber != userEntered)
		{
			System.out.println("Please entered the number : ");
			userEntered = sc.nextInt();
			
			if(userEntered == luckyNumber)
			{
				System.out.println("You won!!!");
			}
			else 
			{
				System.out.println("Please try again.");
			}
		}
	}

}
