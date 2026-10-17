package com.practice.constructors1;

public class Student {
	
	String studentName;
	int age;
	String dept;
	String address;
	
	Student(String _studentName, int _age, String _dept, String _address){
		
		this.studentName = _studentName;
		this.age = _age;
		this.dept = _dept;
		this.address = _address;
		
	}
	
	Student(String _studentName, String _address){
		
		this.studentName = _studentName;
		this.address = _address;
		
	}
	
	Student(){
		System.out.println("This is no argument constractor");
	}

}
