package com.practice.constructors2;

public class Test4 {
	
	public void showResult(Boolean flag) {
		if(flag==true) {
			goInside();
		}else {
			goOutside();
		}
	}
	
	private void goInside() {
		System.out.println("Test4.goInside() START");
		
		System.out.println("Test4.goInside() END");
	}
	
	private void goOutside() {
		System.out.println("Test4.goOutside() START");
		
		System.out.println("Test4.goOutside() END");
	}

}
