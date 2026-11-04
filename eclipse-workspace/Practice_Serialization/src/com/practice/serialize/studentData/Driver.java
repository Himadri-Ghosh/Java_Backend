package com.practice.serialize.studentData;

import java.io.IOException;

public class Driver {

	public static void main(String[] args) throws IOException 
	{
		StudentSerialization studentSerialization = new StudentSerialization();
		
		StudentDetails studentDetails = new StudentDetails("Raju", "Kolkata, WB", 16);
		
		studentSerialization.serilizeStudentDetails(studentDetails);
	}

}
