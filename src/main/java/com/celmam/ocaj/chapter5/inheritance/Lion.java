package com.celmam.ocaj.chapter5.inheritance;

import java.io.IOException;

public class Lion extends Animal {

	private int age=25;
	
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
	
	

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	private void roar() {
		System.out.println("The " + getAge() + " year old lion says: Roar!");
		
	}
	
	public Integer  contarPatas() {
		int patas=0;
		patas=super.contarPatas();
		return 4;
	}
	
	public void metodoExeption() {
			
	}
	
	public static String comer() {
		System.out.println("Leon comiendo");
		return "comiendo";
	}

	
	
	
}
