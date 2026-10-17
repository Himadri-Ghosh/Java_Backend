package com.practice.string1;

public class Driver1 {

	public static void main(String[] args) 
	{
		String st1 = "Raju"; //SCP
		String st2 = "Kumar";  // SCP
		
		String st3 = new String("RajuKumar"); // HEAP + SCP
		
//		System.out.println(st1 == st2);
		
		String st7 = st1.concat(st2).intern(); // HEAP
		
//		System.out.println(st7);
		
//		System.out.println(st3 == st7);
		
//		System.out.println(st7.equals(st3)); // it checks the content of the string and return boolean type.
		
		System.out.println(st3.intern() == st7); // s3.intern() will checks that there has any content in the SCP, if there is any content same to the s3 then it will referance to that string, if not then it will create a copy of that string in the SCP and refer to that string. 
		
		
	}

}
