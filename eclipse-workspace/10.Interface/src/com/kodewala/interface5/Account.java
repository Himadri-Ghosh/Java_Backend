package com.kodewala.interface5;

public class Account implements Cloneable  // giving permission so that object of this.class can be copied/clone
{
	String name;
	String address;
	String accountNo;
	
	Account(String name, String address, String accountNo)
	{
		this.name = name;
		this.address = address;
		this.accountNo = accountNo;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}
