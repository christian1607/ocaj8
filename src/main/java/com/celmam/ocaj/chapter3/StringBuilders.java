package com.celmam.ocaj.chapter3;

import java.util.Date;

public class StringBuilders {

	/*
	 * You should use StringBuilder instead String when the code works 
	 * with many Strings because a String is immutable and every String operation create 
	 * a new instance, instead of the StringBuilder that is not  immutable 
	 * */
	
	public static void main(String[] args) {
		
		
		StringBuilder stringBuilder=new StringBuilder();
		StringBuilder stringBuilder2=new StringBuilder("animal");
		StringBuilder stringBuilder4=new StringBuilder("xxxx");
		StringBuilder stringBuilder3=new StringBuilder(10);

		
		System.out.println(stringBuilder.toString());
		System.out.println(stringBuilder2.toString());
		System.out.println(stringBuilder3.toString());
	
		
		stringBuilder3.append("Altamirano").insert(1, "YYY");
		stringBuilder3.insert(1, "XXX");
		
		System.out.println(stringBuilder3.charAt(0));
		System.out.println("XZZZZ"+stringBuilder3);
		System.out.println(stringBuilder3.toString());
		
		System.out.println("=="+stringBuilder3.substring(2, 2));
		System.out.println(stringBuilder3.toString());
		
		System.out.println(stringBuilder3.indexOf("a",4));
		System.out.println(stringBuilder3.toString());
		
		System.out.println("111"+stringBuilder4.delete(0, 3));
		
		
		StringBuilder puzzle=new StringBuilder("ABCD");
		puzzle.append("vaJ$").append(new Date()).substring(0, 4);
		System.out.println(puzzle);
		
		
		StringBuilder testDiferenteTipos=new StringBuilder("Test");
		testDiferenteTipos.append(true).append(1);
		System.out.println(testDiferenteTipos);
		
		
		StringBuilder reverseWord=new StringBuilder("Altamirano");
		reverseWord.reverse();
		System.out.println(reverseWord);
		
		
		
		//Substring method is immutable
		StringBuilder wordmagic=new StringBuilder("Altamirano");
		System.out.println(wordmagic.substring(1,3).length());
		System.out.println(wordmagic);
		
		
		String cadena="Altamirano";
		
		//cannot compare == 
//		if(wordmagic==cadena) {
//			System.out.println("Iguales");
//		}
		
		
		String fullPhoneNumber="xxx-xxx-zzzz";
		String String=new StringBuilder("xxx-xxx-")+fullPhoneNumber.substring(8);
		System.out.println(String);
		
		
		
		StringBuilder apellido=new StringBuilder(10);
		System.out.println("============");
		System.out.println(apellido);
		apellido.append("ta");
		apellido.insert(0,"Al");
		System.out.println(apellido);
		apellido.insert(0, "mirano", 0,6 );
		System.out.println(apellido);
		
		
	}

	
	

	
	
	
	
	
}
