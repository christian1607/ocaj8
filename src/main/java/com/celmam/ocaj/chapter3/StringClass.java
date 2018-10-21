package com.celmam.ocaj.chapter3;

public class StringClass {

	String frase = "Frase 1";
	String frase2 = new String("Frase 2");
	String frase3 = new String(frase);
	

	public static void main(String args[]) {

		// Concatenation: left to right

		System.out.println(1 + 3);
		System.out.println("1" + "3");
		System.out.println(1 + 3 + "4");

		String uno = "1";
		uno += 2;
		uno += 3;

		System.out.println(uno);

		// Immutability
		// Once a String object is created, it is not allowed to change. It cannot be
		// made larger or
		// smaller, and you cannot change one of the characters inside it.
		String s1 = "1";
		String s2 = s1.concat("2");
		s2.concat("3");
		s2 += 4;
		System.out.println(s2);

		/*
		 * Important String methods
		 */

		String frase = "Don't be evil";

		// lenght
		System.out.println(frase.length());

		// charAt

		System.out.println(frase.charAt(0));
		System.out.println(frase.charAt(1));
		
		// indexof

		System.out.println(frase.indexOf("'"));
		System.out.println(frase.indexOf("be"));
		System.out.println(frase.indexOf("be", 7));

		// substring
		System.out.println("substring"+frase.substring(1,1));

		// replace

		String animal = "burro";

		System.out.println(animal.replace('r', 'R'));

		String result = "AniMaL				".trim().toLowerCase().replace('a', 'A');
		System.out.println(result);
		
		
		
		
		
		String a = "2cfalse";

		String b = "2cfalse";
		 if ( a == "2cfalse") System.out.println("==");
		 if ( a.equals("2cfalse")) System.out.println("equals");
		
		
		 
		 String letters = "abcdef";
		 System.out.println(letters.length());
		 System.out.println(letters.charAt(3));
		 System.out.println(letters.charAt(6));
		
		 
		
	}

}
