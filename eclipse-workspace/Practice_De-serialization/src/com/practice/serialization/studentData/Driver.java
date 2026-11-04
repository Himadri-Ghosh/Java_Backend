package com.practice.serialization.studentData;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.practice.serialize.studentData.StudentDetails;

public class Driver {

	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\HP\\Documents\\Kodewala Academy\\Programs\\eclipse-workspace\\Practice_Serialization\\student1.ser");
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		StudentDetails studentDetails = (StudentDetails) ois.readObject();
		
		System.out.println("Name : " + studentDetails.getName());
		System.out.println("Address : " + studentDetails.getAddress());
		System.out.println("Age : " + studentDetails.getAge());
		
		ois.close();
	}

}
