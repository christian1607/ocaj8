package com.celmam.ocaj.chapter2;

public class TernariOperator {

	public static void main(String[] args) {

		int x = 1;

		
		System.out.println(x > 2?"Mayor que 2":"Menor que 2");
		
		System.out.println(x > 2?"String":2);
		
		System.out.println(x > 0 ? x < 4 ? 10 : 8 : 7);

		System.out.println(++x > 1 ? x++ : ++x);
		
		
	
	}

}
