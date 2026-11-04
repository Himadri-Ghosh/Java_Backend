package com.kodewala.serialization.message;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MessageSerialization 
{
	public void serializeMsg(Message message) throws IOException
	{
		FileOutputStream fos = new FileOutputStream("message.ser");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(message);
		
		oos.close();
	}
}
