package com.practice.loop1;

import java.util.Scanner;

public class SumOddNum {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the last range : ");
		int num = sc.nextInt();
		
		SumOddNumLogic odd = new SumOddNumLogic();
		int result = odd.oddNum(num);
		
		System.out.println("Sum of 1 to "+num+" Odd Number : " + result);
		
		sc.close();
	}

}
