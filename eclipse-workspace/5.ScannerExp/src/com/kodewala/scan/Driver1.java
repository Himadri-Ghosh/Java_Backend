package com.kodewala.scan;

import java.util.Scanner;

public class Driver1 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int price=0;
		System.out.println("Enter the price : ");
		// Before reasing the integer, you are going to make sure that user supply an integer
		if(sc.hasNextInt()) {
			price = sc.nextInt();
		}else {
			System.out.println("Please enter the price in right formate.");
		}
		
		System.out.println("Price : " + price);
		sc.close();
	}
}
