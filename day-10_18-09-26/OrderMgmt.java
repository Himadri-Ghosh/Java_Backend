class OrderMgmt{
	
	private int orderAmt = 3500;

	public void placeOrder(String itemName){
		
		OrderMgmt objMgmt = new OrderMgmt();
		
		System.out.println("Total order amount is : " + objMgmt.orderAmt);
	
		System.out.println("Placing an order for : " + itemName);
	
	}

}