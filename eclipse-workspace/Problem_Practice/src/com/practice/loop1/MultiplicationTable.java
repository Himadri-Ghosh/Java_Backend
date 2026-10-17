package com.practice.loop1;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number which table you want : ");
		int num = sc.nextInt();
		
		MultiplicationTableLogic multiple = new MultiplicationTableLogic();
		multiple.multiplicationTable(num);
		
	}

}
