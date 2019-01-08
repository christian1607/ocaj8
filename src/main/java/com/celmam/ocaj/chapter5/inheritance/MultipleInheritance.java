package com.celmam.ocaj.chapter5.inheritance;

public class MultipleInheritance {
	
	public static void main(String[] args) {
		Hijo hijo = new Hijo();
		hijo.makeSomething();
	}

}

class Abuelo {

	public String name = "Abuelo";

	void makeSomething() {

	}
}

class Padres extends Abuelo {
	public String name = "Padres";

	void makeSomething() {

	}
	

	String makeNoisy() {
		return "Noysi";
	}
}

class Hijo extends Padres {
	public String name = "Hijo";

	void makeSomething() {
		System.out.println(super.makeNoisy());
	}
}
