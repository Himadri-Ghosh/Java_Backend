package com.practice.objects.instanceBlock;

public class Driver1 {

	public static void main(String[] args) 
	{
		System.out.println("Account1.main() START");
		
		Account1 acc1 = new Account1();
		Account1 acc2 = new Account1("934874384309");
		Account1 acc3 = new Account1();
		Account1 acc4 = new Account1("27487495594940");

		System.out.println("Account1.main() END");		
	}

}
