package com.celmam.ocaj.chapter2;

public class IncrementDecrement {

	public static void main(String ar[]) {

		int x = 9;

		System.out.println(x++);
		System.out.println(x);
		System.out.println(--x);
		System.out.println(x);

		int y = 4;
		int w = 3;
		int z = --y + w + ++y;
		System.out.println("==========");
		System.out.println(y);
		System.out.println(w);
		System.out.println(z);

		char vocal = 'a';
		System.out.println(++vocal);
		vocal+=35;
		System.out.println(vocal);

		
		int a=2,b=3,c=4,d=5;
		 d= --a + (++a);
		System.out.println("El valor de D es: " +d);

		int x1 = 3;
		int y1 = ++x1 * 5 / x1-- + --x1;
		System.out.println("x is " + x1);
		System.out.println("y is " + y1);

		Integer numero = 10;

		++numero;
		System.out.println(numero);
		
		
		
	}
	
}



