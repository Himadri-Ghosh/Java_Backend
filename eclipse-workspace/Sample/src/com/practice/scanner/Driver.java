package com.practice.scanner;

import java.util.Scanner;

public class Driver 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your name : ");
		String name = sc.nextLine();
		
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter your address : ");
		String address = sc.nextLine();
		
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("Address : " + address);
		
		sc.close();
	}
}
