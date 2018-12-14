package com.celmam.ocaj.chapter2;

public class LogicalOperator {

	public static void main(String[] www) {

		boolean y = true & false;
		System.out.println(y);

		// && || short circuit

		int x = 6;
		boolean z = (x >= 6) || (++x <= 7);

		System.out.println("Value of X " + x);

		/*
		 * If you could notice the value of x is 6 even though there is a increment
		 * unary operator (++x) in this case the expresion can't reach to that point
		 * because of short circuit (||), the left side (X>=6) is true so there is no
		 * needed to continue with the all expression because with OR logical operator
		 * with at least one true the result is true.
		 */

		int a = 10;

		int b = ++a;
		System.out.println("Value of B:" + b);

		boolean b1 = false;
		boolean b2 = false;

		if (b1 = !b2 != b2) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}

}
