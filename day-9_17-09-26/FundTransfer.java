class FundTransfer{
	
	public static void main(String args[]){
		
		System.out.println("Starting main()");
		
		// Calling methods and passing the values
		boolean result = FundTransfer.doTransaction(10, "987654231", "1234567890");
		
		System.out.println("Is txn successful ? " + result);
		
		System.out.println("Ending main()");
		
	}
	
	static boolean doTransaction(int amountToBeTxn, String senderAccNo, String recAccNo){
		
		System.out.println("Entered doTransaction()");
		
		System.out.println("Input Received " + amountToBeTxn + " " + senderAccNo + " " + recAccNo);
		
		System.out.println("Exit doTransaction()");
		
		return true;
		
	}
	
}