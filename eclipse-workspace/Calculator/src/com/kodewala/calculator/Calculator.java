package com.kodewala.calculator;

import java.util.Scanner;

public class Calculator 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number1 : ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter Number2 : ");
		int num2 = sc.nextInt();
		
		int add = num1 + num2;
		int sub = num1 - num2;
		int multi = num1 * num2;
		int div = num1 / num2;
		
		
		System.out.println("Addition of two number is : " + add);
		System.out.println("Subtraction of two number is : " + sub);
		System.out.println("Multiplaction of two number is :" +multi);
		System.out.println("Division of two number is :" +div);
		sc.close();
	}
}
