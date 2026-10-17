package com.practice.stringBuilder;

public class Driver2 {

	public static void main(String[] args) 
	{
		QueryGenerator generator = new QueryGenerator();
		StringBuilder result = generator.generatorQuery(21090, null);
		System.out.println(result);
	}

}
