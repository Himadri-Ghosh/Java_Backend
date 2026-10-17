package com.practice.string1;

public class Driver4 
{

	public static void main(String[] args) 
	{
		String s1 = "Abhi";
		
		String s2 = new String("Abhi");
		
		String s3 = new String("Something");
		String s4 = new String("Something");
		
		String s5 = "Rohit";
		
		String s6 = s5.concat("Kumar");
		
		System.out.println(s1 == s2.intern());
		
		System.out.println(s3.equals(s4));
		
		System.out.println(s6);
		
	}

}

