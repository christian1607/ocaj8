package com.celmam.ocaj.chapter1;


/**
 * Primitives Types cannot be assing null value
 * Primitive Type does not have methods
 * */

public class PrimitiveTypes {

	
	boolean mientes;
	
	//number without decimal
	byte bites=25; 				// (+-)2^8
	short number1=25555; 		// (+-)2^16
	int number2=0; 			// (+-)2^32
	int numberInt2=1000_00;
	//int numberInt3=1,000,000; not valid
	int numberInt=0xE;
	long number3=2555555555555555555L; 	// (+-)2^64
	
	//Float a double are used for floating-point (decimal)
	float number4=255555555f;
	double $number5=0xE;
	char _caracter='A';
	String name;
	
	int prueba=2____1;
	double dopublenumber=2.1_1;
	
	
	
	public void method() {
		
		
		
	}
	
	
	public static void main(String strings[]) {
	
		//primitives datatpe does not have methods
	
		PrimitiveTypes pt=new PrimitiveTypes();
	
	
		System.out.println("Int max value "+Integer.MAX_VALUE);
		System.out.println("Int min value "+Integer.MIN_VALUE);
		
		System.out.println("Hexadecimal "+pt.number1);
		System.out.println("Hexadecimal "+pt.name);
		
		
	}
	
}
