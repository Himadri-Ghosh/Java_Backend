package com.kodewala.constructors7.Level1;

public class Driver4 {

	public static void main(String[] args) {
		
		Student4 s1 = new Student4();
		
		Student4 s2 = new Student4("Rahul");
		System.out.println("Name : " + s2.name);
		
		Student4 s3 = new Student4("Amit", 25);
		System.out.println("Name : " + s3.name);
		System.out.println("Name : " + s3.age);
	}

}
