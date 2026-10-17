class Driver{

	public static void main(String args[]){
	
		System.out.println("Driver() Start....");
		
		OrderMgmt objMgmt = new OrderMgmt();
		
		objMgmt.placeOrder("iphone 17");
		
		//System.out.println("Total order amount is : " + objMgmt.orderAmt);
		
		System.out.println("Driver() End....");
	
	}

}