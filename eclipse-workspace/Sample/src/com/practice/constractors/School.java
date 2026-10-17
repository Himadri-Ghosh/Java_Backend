package com.practice.constractors;

public class School {
	
	public static void main(String args[]) {
		
		StudentInfo student1 = new StudentInfo("Rohit", "23", "Arts", "Sector V, Kolkata, WB");
		StudentInfo student2 = new StudentInfo("Shyam", "15", "Science", "Newtown, Kolkata, WB");
		
		System.out.println("-------Student1--------");
		System.out.println("Name : " + student1.name);
		System.out.println("Roll No. : " + student1.roll);
		System.out.println("Department : " + student1.dept);
		System.out.println("Address : " + student1.address);
		
		System.out.println("-------Student2--------");
		System.out.println("Name : " + student2.name);
		System.out.println("Roll No. : " + student2.roll);
		System.out.println("Department : " + student2.dept);
		System.out.println("Address : " + student2.address);
		
	}

}
