package com.celmam.ocaj.chapter5.inheritance;

import java.io.IOException;

public class Lion extends Animal {

	public Lion(int age) {
		
//		super(age);
		super(age,"reptil");
	}
	
	public Lion(String sa) {
//		this(3);
		super(2);
	}
	
	public Lion() {
		super();
	}

	private void roar() {
		System.out.println("The " + getAge() + " year old lion says: Roar!");
		
	}
	
	public Integer  contarPatas() {
		int patas=0;
		patas=super.contarPatas();
		return 4;
	}
	
	public void metodoExeption() throws Exception {
		
		
	}
}
