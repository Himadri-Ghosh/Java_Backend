package com.practice.string1;

import java.util.Scanner;

public class User1 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your First Name : ");
		String firstName = sc.nextLine();
		
		System.out.println("Enter Your Last Name : ");
		String lastName = sc.nextLine();
		
		System.out.println("Enter Your City : ");
		String city = sc.nextLine();
		
		System.out.println("Enter Your Profession : ");
		String profession = sc.nextLine();
		
		String first = "My name is ";
		String second = ". I live in ";
		String third = ". I am a ";
		
		String fullName = firstName.concat( lastName);
		String result1 = first.concat(fullName);
		String result2 = second.concat(city);
		String result3 = third.concat(profession);
		
		String result = result1.concat(result2).concat(result3);
		
		System.out.println(result);
		
		sc.close();
	}

}
