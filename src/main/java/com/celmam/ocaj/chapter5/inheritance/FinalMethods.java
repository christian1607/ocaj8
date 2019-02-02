package com.celmam.ocaj.chapter5.inheritance;

public class FinalMethods {

	private void finalMethod() {
		
		System.out.println("Parent method");
		
	}
	
}


class MyFinalMethod extends FinalMethods {
	
	
	void finalMethod() {
		System.out.println("Child method");
	}
	
	
	public static void main(String[] args) {
		
		FinalMethods fm=new MyFinalMethod();
		// reference fm cannot see finalMethod() because the child is not overriden that method
	}
}