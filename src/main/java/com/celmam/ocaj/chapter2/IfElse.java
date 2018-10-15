package com.celmam.ocaj.chapter2;

public class IfElse {

	public static void main(String... strings) {

		int x = 0;

		if (++x > 0) {
			System.out.println("X=" + x);
		} else {
			System.out.println("Aun no es asignado");
		}

		if (true)
			System.out.println("Printig inside if block");
		System.out.println("Priting outside if block");

		if (false)
			System.out.println("Printig inside if block");
		System.out.println("Priting outside if block");

	}

}
