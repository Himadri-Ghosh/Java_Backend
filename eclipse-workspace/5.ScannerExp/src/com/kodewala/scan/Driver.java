package com.kodewala.scan;

import java.util.Scanner;

public class Driver 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in); // Creates connection with console
		
		System.out.println("Please enter name : ");
		String name = sc.nextLine(); // reading string input
		
		System.out.println("Please enter product price : ");
		int price = sc.nextInt(); // reading int -->
		sc.nextLine();
		
		System.out.println("Please enter delivery address : ");
		String address = sc.nextLine();
		
		System.out.println("Name : " + name);
		System.out.println("Price : " + price);
		System.out.println("Address : " + address);
		
		sc.close();
	}
}
