package com.practice.scanner;

import java.util.Scanner;

public class Driver1 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int number = 0;
		System.out.println("Enter a number : ");
		
		if(sc.hasNextInt()) {
			number = sc.nextInt();
			System.out.println("Your number is : " + number);
		}else {
			System.out.println("Please enter the number in a valid formate.");
		}
		
		sc.close();
	}
}
