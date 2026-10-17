package com.practice.loop1;

import java.util.Scanner;

public class SumEvenNum {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the last Range : ");
		int num = sc.nextInt();
		
		SumEvenNumLogic logic = new SumEvenNumLogic();
		int result = logic.evenSum(num);
		
		System.out.println("Sum of 1 to "+num+ " Even Number : " + result);
		
		sc.close();
	}

}
