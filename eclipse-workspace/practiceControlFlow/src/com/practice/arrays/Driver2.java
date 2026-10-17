package com.practice.arrays;

public class Driver2 
{
	public static void main(String args[])
	{
		/**
		 * In this array i store integer value 
		 */
//		int nums[] = new int[5];
//		
//		nums[0] = 10;
//		nums[1] = 37;
//		nums[2] = 15;
//		nums[3] = 59;
//		nums[4] = 24;
//		
//		System.out.println(nums[0]);
//		System.out.println(nums[1]);
//		System.out.println(nums[2]);
//		System.out.println(nums[3]);
//		System.out.println(nums[4]);
		
		/**
		 * In this array i stored String array
		 */
		String names[] = new String[6];
		
		names[0] = "Raju";
		names[1] = "Abhi";
		names[2] = "Shymal";
		names[3] = "Madhu";
		names[4] = "Bimal";
		names[5] = "Dipu";
		
		for(int i=0; i<names.length; i++) {
			System.out.println("Name"+i+" : " + names[i]);
		}
	}
}
