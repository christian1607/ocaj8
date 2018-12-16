package com.celmam.ocaj.chapter4;

import com.celmam.ocaj.chapter4.modificatorPackage.ConstructorTest;

public class Constructors {

	private String name;
	private String lastName;
	private final String alias;
	
	public Constructors(String name, String lastName) {

		// this.name = name;
		// this.lastName = lastName;
		this.alias = "lenki";
		//Here the compiler DONT asume that the left name is pointing to instance variable of class Constructors
		name = name;

	}
	
	public Constructors(int numero) throws Exception {

		throw new Exception("Error en constructor");
	}

	

	public void methodSameParameterName(String name) {
		name = name;
	}

	public void methodifferentParameterName(String names) {
		name = names;
	}

	
	
	public Constructors(String name) {
		// we can call a other constructor in the constructor method using this keyword
		// but it must be placed in the first line of the statement
		this(name, name);
		System.out.println("");

	}

	public static void main(String... strings) {

		Constructors c = new Constructors("cr7");
		c.methodifferentParameterName("Christian");
		c.methodSameParameterName("Anddy");
		System.out.println(c.name);
		
		
		
		
	}

}
