package com.celmam.ocaj.chapter1;

public class VariableScope {

	
	/** The variable scope is defined by the curly braces {}
	 *  this means a varible outside of its scope will not compile
	 * */
	int num=2;
	
	public void destroyWorld(String planet) {
		
		int num;
		num=2;
		System.out.println(num);
		planet="Earth";
		
		
	}
	
	
	public static void main(String... strings) {
		
		new VariableScope().destroyWorld("earth");
	}
	
	
//	planet="Mars"
	
}
