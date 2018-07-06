package com.celmam.ocaj.chapter4;

public class Constructors {
	
	private String name;
	private String lastName;
	private final String  alias;
	
	public Constructors(String name, String lastName) {
		
		this.name = name;
		this.lastName = lastName;
		this.alias="lenki";
	
	}

	
	public Constructors(String name) {
		//we can call a other constructor in the constructor method using this keyword
		// but it must be placed in the first line of the statement
		this(name, name);
		System.out.println("");
		
	}

	
	
	
	
	
	
}
