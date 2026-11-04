package com.practice.interface8;

public class School {

	public static void main(String[] args) throws CloneNotSupportedException 
	{
		Student student = new Student("Rahul", "Kolkata", 22);
		
		Student stu = (Student) student.clone();
		
		System.out.println(stu.name);
	}

}
