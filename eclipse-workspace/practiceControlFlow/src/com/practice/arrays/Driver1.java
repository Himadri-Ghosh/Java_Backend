package com.practice.arrays;

public class Driver1 
{
	public static void main(String args[]) 
	{
		Student student1 = new Student("Ram", 20, "Kolkata");
		Student student2 = new Student("Kamal", 20, "Pune");
		Student student3 = new Student("Abhi", 20, "Goa");
		Student student4 = new Student("Rohit", 20, "Delhi");
		
		Student[] student = new Student[4];
		student[0] = student1;
		student[1] = student2;
		student[2] = student3;
		student[3] = student4;
		
		for(int i=0; i<student.length; i++) {
			System.out.println("Name : " + student[i].name+ "; Age : "+student[i].age+ "; Location : "+student[i].location);
		}
	}
}
