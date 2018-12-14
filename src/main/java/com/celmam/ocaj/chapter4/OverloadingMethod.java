package com.celmam.ocaj.chapter4;

public class OverloadingMethod {

	// The overloading just check the method's parameter and the name
	public void metodo() {

	};

	public void metodo(String a) {

	};
	//
	// public static void metodo() throws Exception {
	//
	// };

	// public String metodo() throws Exception {
	//
	// };

	// Be careful with varargs, as we could see in previous chapter varargs are
	// treated as array
	// therefore is not posible to do a method overloading
	void metodo2(String[] args) {

	}

	void method() {
	}
	// public void metodo2(String... args) {
	//
	// }

	// Autoboxing
	public void metodo3(Object num) {
		System.out.println("Call metodo3 Object");
	}

	public void metodo3(Integer num) {
		System.out.println("Call metodo3 Integer");
	}

	public void metodo3(int num) {
		System.out.println("Call metodo3 Int");
	}

	// in this case both methods are equals
	// public void fly(int[] lengths) {
	// System.out.println("fly method called");
	// }

	public void fly(int... lengths) {
		System.out.println("fly method varargs called");
	}

	public void moreE(String[] values, int... nums) {
	}

	// autoboxing for primitives types
	public void calculate(int valor) {
		System.out.println("calculate int");
	}

	public void calculate(long valor) {
		System.out.println("calculate long");
	}

	public void calculate(double valor) {
		System.out.println("calculate double");
	}

	public void twofase(Long valor) {
		System.out.println("calculate Long");
	}

	public static void printSum(double a, double b) {
		System.out.println("In double " + (a + b));
	}

	public static void printSum(float a, float b) {
		System.out.println("In float " + (a + b));
	}

	public static void main(String... strings) {

		OverloadingMethod method = new OverloadingMethod();

		method.metodo3(1);
		method.metodo3(new Integer(1));
		method.metodo3("");

		method.fly(new int[] { 1, 2, 3 });
		method.fly(1, 2, 3);

		method.calculate(new Double(1));
		method.calculate(1);
		method.calculate(1l);

		// java does not support two fase autoxing
		// method.twofase(1);
		method.twofase(1l);
		
		
		printSum(1.0, 2.0);
		printSum(1.0f, 2.0);
		printSum(1.0f, 2.0f);
	}

}
