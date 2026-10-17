package com.kodewala.stringBuilder2;

public class Driver {

	public static void main(String[] args) 
	{
		QueryGenerator generator = new QueryGenerator();
		StringBuilder sb = generator.generatorQuery(0, "emp3287");
		System.out.println(sb);
	}

}
