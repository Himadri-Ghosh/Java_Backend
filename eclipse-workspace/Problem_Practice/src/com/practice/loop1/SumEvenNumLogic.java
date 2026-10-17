package com.practice.loop1;

public class SumEvenNumLogic 
{
	int sum;
	int evenSum(int num)
	{
		for(int i=1; i<=num; i++)
		{
			if(i%2 == 0) {
				sum += i;
			}
		}
		return sum;
	}
}
