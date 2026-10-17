package com.practice.loop1;

public class SumOddNumLogic 
{
	int sum;
	int oddNum(int num)
	{
		for(int i=0; i<=num; i++)
		{
			if(i%2 != 0)
			{
				sum += i;
			}
		}
		return sum;
	}
}
