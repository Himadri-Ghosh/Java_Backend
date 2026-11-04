package com.practice.serialize.message;

import java.io.IOException;

public class Driver {

	public static void main(String[] args) throws IOException 
	{
		MessageSerialization messageSerialization = new MessageSerialization();
		
		Message message = new Message("Hii, How aer you?", "MG3936");
		
		messageSerialization.serializeMsg(message);
	}

}
