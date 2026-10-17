package com.practice.loop1;

public class DivisibleBy3 {

	public static void main(String[] args) 
	{
		DivisibleBy3Logic divisible = new DivisibleBy3Logic();
		int result = divisible.divisibleBy3();
		
		System.out.println("Total "+result+" numbers are divisible by 3 within 1 to 100");
	}

}
