package com.practice.oops.inheritance5;

public class Computer extends Device
{
	String processor;
	
	Computer(String brand, double price, String processor)
	{
		super(brand, price);
		this.processor = processor;
	}
	
	void runProgram()
	{
		System.out.println("Brand : " + brand);
		System.out.println("Price : " + price);
		System.out.println("Computer.runProgram()......" + processor);
	}
}
