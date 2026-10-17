package com.practice.control.flow1;
import java.util.*;

public class Driver3 
{
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your total bill amount : ");
		int billAmount = scanner.nextInt();
		
		DelivaryCharge delivary = new DelivaryCharge();
		int payableAmount = delivary.foodDelivary(billAmount);
		
		System.out.println("Delivary charge : " + delivary.charges);
		System.out.println("You payable amount is : " + payableAmount);
		
		scanner.close();
	}
}
