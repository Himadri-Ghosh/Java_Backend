package com.practice.constractors;

import com.amazon.sample.OrderMgmt;

public class Items {
	    
	public static void main(String args[]) {
		
		System.out.println("Items.main() START..........");
		
		OrderMgmt objMgmt = new OrderMgmt();
		
		objMgmt.placeOrder("iPhone 18");
		
		System.out.println("Items.main() END............");
		
	}

}
