package com.celmam.ocaj.chapter1;

public class ClassVariable {

	//Class Variables are share across the objects 
	// to create a class variable, you must add 'static' keyword
	public static String name="Christian";
	
	
	
	
	public static void main(String... args) {
		
		System.out.println("My first name is: "+ClassVariable.name);
	}
	
}
