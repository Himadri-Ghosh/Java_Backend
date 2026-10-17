package com.practice.constractors;

public class SubtractionTwo {
		
		public static void main(String args[]) {
			
			String num1 = args[0];
			String num2 = args[1];
			
			int num1Int = Integer.parseInt(num1);
			int num2Int = Integer.parseInt(num2);
			
			int sub = subTwo(num1Int, num2Int);
			
			System.out.println("Subtraction of two num : " + sub);
			
			
		}
		
		static int subTwo(int a, int b) {
			
			return a-b;
			
		}

}
