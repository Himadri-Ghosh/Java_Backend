package com.practice.interface8;

class PDF implements Processable
{
	
}

class Word implements Processable
{
	
}
class Image
{
	
}


public class Driver {

	public static void main(String[] args) 
	{
		PDF pdf = new PDF();
		Word word = new Word();
		Image image = new Image();
		
		if(image instanceof Processable)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		
	}

}
