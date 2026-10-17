package com.practice.constractors;

public class Driver {
	
	public static void main(String args[]) {
		

		AccountHolder user1 = new AccountHolder(4027, "39264859047", "Rohit", "9845272802");
		AccountHolder user2 = new AccountHolder(5109, "40393759308", "Pritam", "9273549302");
		
		System.out.println("-------user1------");
		System.out.println("Amount : " + user1.amount);
		System.out.println("Account No. : " + user1.account);
		System.out.println("Name : " + user1.name);
		System.out.println("Phone No. : " + user1.phoneNumber);
		
		
		System.out.println("-------user2------");
		System.out.println("Amount : " + user2.amount);
		System.out.println("Account No. : " + user2.account);
		System.out.println("Name : " + user2.name);
		System.out.println("Phone No. : " + user2.phoneNumber);
		
	}

}