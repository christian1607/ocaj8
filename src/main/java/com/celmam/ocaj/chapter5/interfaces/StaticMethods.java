package com.celmam.ocaj.chapter5.interfaces;

public class StaticMethods implements IStaticMethod{
	
	

	private static String doStaticMethod() {
		return "It is a static method class";
	} 
	
	
	public static void main(String[] args) {
		StaticMethods sm=new StaticMethods();
		
		//Static method is called using the name of the interface that implements,
		// the subclass that implements cannot implements
		IStaticMethod.doStaticMethod();
		System.out.println(doStaticMethod());
		System.out.println(sm.doStaticMethod());
	}

}


interface IStaticMethod{
	
	static String doStaticMethod() {
		
		return "It is a static method interface";
	}
	
	
}
