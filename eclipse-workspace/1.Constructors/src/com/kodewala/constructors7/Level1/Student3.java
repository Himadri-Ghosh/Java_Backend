// Parameterized Constructor :

package com.kodewala.constructors7.Level1;

public class Student3 
{
	String name;
	int age;
	
	Student3(String _name, int _age){
		this.name = _name;
		this.age = _age;
	}
	
	void display() {
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
	}
}
