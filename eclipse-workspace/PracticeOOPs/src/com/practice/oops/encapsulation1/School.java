package com.practice.oops.encapsulation1;

public class School {

	public static void main(String[] args) 
	{
		Student student1 = new Student();
		student1.setAge(15);
		int age1 = student1.getAge();
		System.out.println(age1);
		
		Student student2 = new Student();
		student2.setAge(0);
		int age2 = student2.getAge();
		
		System.out.println(age2);

	}

}
