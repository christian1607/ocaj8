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

	
	
		for (int i = 0; i < 10;) {

			i = i++;

			System.out.println("Hello World");
		}
	}
}
