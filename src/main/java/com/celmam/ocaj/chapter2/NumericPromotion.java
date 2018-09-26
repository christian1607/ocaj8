package com.celmam.ocaj.chapter2;

public class NumericPromotion {

	public static void main(String... strings) {

		/*
		 * If one of the values is integral and the other is floating-point, Java will
		 * automatically promote the integral value to the floating-point value’s data
		 * type.
		 */
		int num1 = 2;
		double num2 = 4.0;

		double suma = num1 + num2;
		// int suma2=num1+num2;

		long num3 = 12333434;

		// If two values have different data types, Java will automatically promote one
		// of the values to the larger of the two data types.
		long mult = num1 * 2;
		// int mult2=num3*2;

		short num5 = 3;
		short num6 = 10;
		

		double sum4=num5+num6;
		long sum41=num5+num6;
		int sum42=num5+num6;
		
		/*
		 * Smaller data types, namely byte , short , and char , are first promoted to
		 * int any time they’re used with a Java binary arithmetic operator, even if
		 * neither of the operands is int .
		 */

		int div = num6 / num5;
		// short div2=num6/num5;

		byte sum = (byte) 3 + 50;
		System.out.println(sum);

		byte a = 40, b = 50;
		
		
		byte sum2 = (byte) (a + b);
		System.out.println(sum);
		
		
		short x = 14;
		float y = 13;
		double z = 30;
		
		z=x * y / z;
		
		
		
		double resultado=3.4%2;
		System.out.println(resultado);
		
		double resultado2=3.4/2;
		System.out.println(resultado2);
		
		
		
		
		double doublenumber=2.3;
		float floatnumber=2.3f;
		
		double resultado3 = doublenumber+floatnumber;
		
		// short byte char  ===>int
		
		char ab='5';
		int res=ab+2;
		System.out.println(res);
		
		
		
		short shor1=10;
		short shor2=12;
		
		double shor3=shor1+shor2;
		
	}

}
