class ANDOperator{

	public static void main(String args[]){
		
		int minAge = 18;
		int maxAge  = 60;
		
		int userAge = Integer.parseInt(args[1]);
		String name = args[0];
		
		System.out.println("Applying for DL : " + name);
		
		System.out.println("Condition1 : " + (minAge < userAge));
		System.out.println("Condition2 : " + (maxAge > userAge));
		
		System.out.println("Allowed for DL : " + ((minAge < userAge) && (maxAge > userAge)));
		
		String message = (minAge < userAge) ? "Allowed" : "Not Allowed";
		
		System.out.println(message);
		
	}

}