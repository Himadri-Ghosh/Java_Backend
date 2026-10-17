class AddTwoNumber{

	public static void main(String args[]){
	
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
	
		int sum = AddTwoNumber.addNum(num1, num2);
		
		System.out.println("Sum of two num : " + sum);
	
	}
	
	static int addNum(int a, int b){
		return a+b;
	}
}