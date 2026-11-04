package com.kodewala.serialize.message;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.kodewala.serialization.message.Message;

public class Driver {

	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\HP\\Documents\\Kodewala Academy\\Programs\\eclipse-workspace\\11.Serialization\\message.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Message message = (Message) ois.readObject();
		System.out.println("Message : " + message.getMessage());
		System.out.println("Message ID : " + message.getMessageId());
		System.out.println("User ID : " + message.getUserId());
		
		ois.close();
	}

}
