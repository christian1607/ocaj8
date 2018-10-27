package com.celmam.ocaj.chapter2;

public class Loop {

	public static void main(String[] args) {

		dfd: for (int a = 1; a <= 4; a++) {
			for (char x = 'a'; x <= 'c'; x++) {
				if (a == 2 || x == 'b')
					continue dfd;
				System.out.print(" " + a + x);
			}
		}

		// This is a infinit loop
		// for (int i = 0; i < 10;) {
		// System.out.println("Hello World");
		// }

		// Solve
		for (int i = 0; i < 10;) {
			i = ++i;
			System.out.println("Hello World");
		}

		for (int i = 0; i < 10; ++i) {
			System.out.println("i=" + i);
		}

		for (int i = 0; i < 10; i++) {
			System.out.println("i=" + i);
		}

		int w = 0;
		for (long y = 0, z = 4; w < 5 && y < 10; w++, y++) {
			System.out.print(y + " ");
		}
		System.out.print(w);

		// Another infinty bucle
		// for (;;) {
		// System.out.println("Infinty bucle");
		// }

		int myArray[] = { 1, 2, 3, 4, 5 };
		for (int n : myArray) {
			System.out.println(n);
		}

		System.out.println("==========================");
		int i = 0;
		for (; i < 2; i = i + 5) {
			if (i < 5)
				continue;
			System.out.println(i);
		}
		System.out.println(i);

	}
}
