package com.kodewala.arrays1;

public class School 
{
	public static void main(String args[])
	{
		Student student1 = new Student("Raju", 19, "History");
		Student student2 = new Student("Shyam", 18, "Math");
		Student student3 = new Student("Abhi", 20, "Biology");
		Student student4 = new Student("Madhu", 22, "Physics");
		
		Student[] student = new Student[4];
		
		student[0] = student1;
		student[1] = student2;
		student[2] = student3;
		student[3] = student4;
		
		for(int i=0; i<student.length; i++) {
			System.out.println("Name : "+student[i].name+"; Age : "+student[i].age+"; Department : "+student[i].dept);
		}
	}
}
