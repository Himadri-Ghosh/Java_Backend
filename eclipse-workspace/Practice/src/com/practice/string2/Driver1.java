package com.practice.string2;

public class Driver1 {

	public static void main(String[] args) 
	{
		String s1 = "Kodewala";
		String s2 = new String("Kodewala");
		
		System.out.println(s1 == s2);
//		System.out.println(s1.equals(s2));
//		System.out.println(s1.concat(s2));
		
		String s3 = s2.intern();
		System.out.println(s1 == s3);
	}

}
