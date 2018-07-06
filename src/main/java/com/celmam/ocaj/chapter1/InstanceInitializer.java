package com.celmam.ocaj.chapter1;

public class InstanceInitializer {


	private String nomnre="";
	
	public InstanceInitializer(){
		
		System.out.println("Construcctor created");
	}
	
	{
		System.out.println("First  block instance initializer");

	}

	public static void main(String[] args) {

		InstanceInitializer initializer = new InstanceInitializer();
		System.out.println("Main block");

	}

	{
		System.out.println("This is a block instance initializer");

	}
}
