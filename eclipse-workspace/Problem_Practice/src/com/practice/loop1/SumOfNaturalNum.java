package com.practice.loop1;

import java.util.Scanner;

public class SumOfNaturalNum {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		System.out.println("Enter the last range : ");
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++)
		{
			sum += i;
		}
		
		System.out.println("Sum of 1 to "+ num + " : " + sum);
		
	}

}
