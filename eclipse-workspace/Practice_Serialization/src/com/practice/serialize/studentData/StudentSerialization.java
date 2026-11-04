package com.practice.serialize.studentData;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class StudentSerialization 
{
	public void serilizeStudentDetails(StudentDetails studentDetails) throws IOException
	{
		FileOutputStream fos = new FileOutputStream("student1.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(studentDetails);
		
		oos.close();
	}
}
