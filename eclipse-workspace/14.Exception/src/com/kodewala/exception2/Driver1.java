package com.kodewala.exception2;

public class Driver1 
{
	public static void main(String args[])
	{
		Account account = new Account();
		String accNo = "SBI098765467";
		String address[] = {"BTM Bangalore", "JP Nagar Bangalore"}; 
		account.doActivateAcc(accNo, address);
	}
}

class Account
{
	void doActivateAcc(String accNo, String address[])
	{
		System.out.println("Account.doActivateAcc()....START");
		
		validateAccDetails(accNo, address);
		
		System.out.println("Account.doActivateAcc()....END");
	}
	
	private boolean validateAccDetails(String accNo, String address[])
	{	
		System.out.println("Account.validateAccDetails()....START");
		
		System.out.println("Validating account details.......");
		System.out.println("Check account status.....");
		
		int accountType = 1;
		String bankName = "SBI";
		boolean isActive = true;
		
		System.out.println("Account Type : " + accountType);
		System.out.println("Bank Name : " + bankName);
		System.out.println("Account Active : " + isActive);
		boolean isValid = false;
		
		try 
		{
			String homeAddress = address[1];
			System.out.println("Home Address : " + homeAddress);
			isValid = accNo.startsWith("SBI");  // NPE if account number is null
			int amount = 100/0;
			int accNoInt = Integer.parseInt(accNo);
			
		}
		catch(NullPointerException e)
		{
			System.out.println("Value is null");
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("You are trying to get an values for invalid index");
			e.printStackTrace();
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmaticExceptiuon.... number / by 0");
			e.printStackTrace();
		}
		catch (Exception e) {  // This block will catch any of the exception Object
			System.out.println("Unknown Error");
			e.printStackTrace();
		}
		
		System.out.println("Account validation completed");
		System.out.println("Account.validateAccDetails()....END");
		
		return isValid;
	}
}