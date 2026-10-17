package com.kodewala.constructors1;

public class Account {
	
	int amount;
	String name;
	
	// if developer is not providing any constractor in a class then compiler create the constractor
	// constractor (no args constractor)
	
	Account(){
		
		System.out.println("inside Account()");
		
	}
	
	Account(int _amount, String _name){
		
		System.out.println("Inside Account(int _amount, String _name)");
		this.amount = _amount;
		this.name = _name;
		
	}
	

}
