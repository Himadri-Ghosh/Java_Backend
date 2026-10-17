package com.practice.constructors1;

public class Shopping {
	
	public static void main(String args[]) {
		
		int totalAmount = Integer.parseInt(args[2]);
		
		OrderDetails objOrder = new OrderDetails(args[0], args[1], totalAmount, args[3]);
		System.out.println("-------------Order Details------------");
		System.out.println("Order Id : " + objOrder.orderId);
		System.out.println("Customer Name : " + objOrder.customerName);
		System.out.println("Total Amount : " + objOrder.totalAmount);
		System.out.println("Delivary Address : " + objOrder.delivaryAddress);
		
	}

}
