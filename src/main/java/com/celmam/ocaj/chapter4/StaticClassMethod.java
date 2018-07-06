package com.celmam.ocaj.chapter4;

//Static import
import static java.util.Arrays.asList;

import java.util.List;


public class StaticClassMethod {

	
	
	public static int contador=0;
	public static final int contador2;
	//  static fieldmust be initialized 
	//public static final int contador3;
	public  static final int contadorFijo=0;
	
	
	
	static {
		
		//contadorFijo=2;
		contador=2;
		contador=3;
		contador2=3;
		
	}
static {
		
		//contadorFijo=2;
		contador=2;
		contador=3;
		
	}
	
		
	public static void main(String...strings) {
		
		StaticClassMethod classMethod=new StaticClassMethod();
		
		System.out.println(classMethod.contador);
				
		classMethod=null;
		
		System.out.println(classMethod.contador);
	
		
		//This is a method that is a static import 
		List<Integer> listanumeros=asList(2,34,5);	
	}
	
}
