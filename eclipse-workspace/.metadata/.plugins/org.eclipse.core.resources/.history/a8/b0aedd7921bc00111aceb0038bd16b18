package com.practice.control.flow1;
import java.util.*;

public class Driver 
{
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter Product Amount : ");
		int productAmount = scanner.nextInt();
		
		scanner.nextLine();
		
		System.out.print("Enter Card Type : ");
		String cardType = scanner.nextLine();
		
		DiscountCalculation discountProduct = new DiscountCalculation();
		discountProduct.discountInfo(cardType, productAmount);
		
		scanner.close();
	}
}
