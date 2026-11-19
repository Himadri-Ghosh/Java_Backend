package com.kodewala.exception7;

public class InsufficientBalanceException extends RuntimeException
{
	public InsufficientBalanceException(String msg)
	{
		super(msg);
	}
}
