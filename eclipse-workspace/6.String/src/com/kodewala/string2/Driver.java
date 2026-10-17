package com.kodewala.string2;

public class Driver {

	public static void main(String[] args) {
		String s1 = "Kodewala"; // SCP -> abc928

		String s2 = new String("Academy"); // One object in SCP + one in heap -> def283

//		System.out.println(s1 == s2);  // false

		String s3 = new String("Kodewala");
		String s4 = new String("Kodewala");

//		System.out.println(s4 == s3);
//		System.out.println(s4.equals(s3));

//		System.out.println(s1 == s3);
		System.out.println(s1.equals(s3));
	}

}
