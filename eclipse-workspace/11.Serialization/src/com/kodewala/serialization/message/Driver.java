package com.kodewala.serialization.message;

import java.io.IOException;

public class Driver {

	public static void main(String[] args) throws IOException 
	{
		MessageSerialization messageSerialization = new MessageSerialization();
		
		Message message = new Message("Kya kar rahi ho?", "MSG1", "UserID28254");
		
		messageSerialization.serializeMsg(message);
	}

}
