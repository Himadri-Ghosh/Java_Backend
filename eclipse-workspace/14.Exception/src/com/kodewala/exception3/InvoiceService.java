package com.kodewala.exception3;

public class InvoiceService 
{
	public void generateInvoice()
	{
//		Get customers and order details from database
//		[Connect with database --> create db connection] +
//		[Get details from DB]
		try {
			connectDatabase();  // Creating connection
			String name = null;
			name.lastIndexOf("a");
			System.out.println("Generating an invoice....");
			//closing
			closeConnectionDB();
			System.exit(0);
		}catch(Exception e)
		{
			System.out.println("Some Exception....");
			e.printStackTrace();
		}
		finally
		{
//			mandatory executable block (Exception or No Exception)
			System.out.println("I'm inside finally block....");
		}
	}
	
	private void connectDatabase() // Connection Objects
	{
		System.out.println("Connected to DB");
	}
	
	private void closeConnectionDB()
	{
		System.out.println("Closing the connection......");
	}
}
