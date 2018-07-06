package com.celmam.ocaj.chapter4;

public class OverloadingMethod {

	// The overloading just check the method's parameter
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

	   void method() {}
	// public void metodo2(String... args) {
	//
	// }

	// Autoboxing
	public void metodo3(Integer num) {
		System.out.println("Call metodo3 Integer");
	}

	public void metodo3(int num) {
		System.out.println("Call metodo3 Int");
	}
	
	
	public static void main(String...strings) {
		
		OverloadingMethod method=new OverloadingMethod();;
		method.metodo3(3);
		
	}
	
	
	
	
}
