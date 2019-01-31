package com.celmam.ocaj.chapter3;

public class EqualityString {

	// equals ====> compare value
	// == ====> compare reference

	public static void main(String[] args) {

		/*
		 * String has a particular behavior in (==) even though it is a Object this
		 * because in equals it compares the literal if and only if it is declare
		 * without new keyword and the String objects created have to be evaluated a compile time
		 */

		String cadena1 = "christian";
		String cadena2 = "christian";

		System.out.println(cadena1 == cadena2);

		
		
		//This case if both Strings objects are evaluated at compile time, they are differents
		//because of the value of their literals.

		String cadena5 = "christian";
		String cadena6 = "christian   ";

		System.out.println(cadena5 == cadena6.trim());
		System.out.println(cadena5.equals(cadena6.trim()));

		
		String language="Java";
		String parte1="Ja";
		String parte2="va";
		
		String parte3=parte1+parte2;
		System.out.println("Sumando partes: ");
		System.out.println("Sumando partes: "+(language==(parte1+parte2)));
		System.out.println("1: "+(language==parte3));
		
		
		/* But this behavior does not take effect if we use new keyword for declare a String
		 * */
		
		String cadena3 =  new String("flor");
		String cadena4 = "flor";

		System.out.println(cadena3 == cadena4);
		
		
	}

}
