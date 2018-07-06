package com.celmam.ocaj.chapter1;

public class Variables {

	//The compiler is also smart enough to recognize initializations that are more complex
	public int num2;
	public boolean verdad;
	
	//Variable local must be initialize before use it
	public static void main(String...strings) {
		
		int num;
		
		//int sum=num2+2;
		System.out.println(new Variables().num2);
		System.out.println(new Variables().verdad);
	}
	
}
