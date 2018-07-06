package com.celmam.ocaj.chapter5.inheritance;

public class Animal {

	private int age;
	
	public Animal() {
		
	}

	public Animal(int age) {

		super();
		this.age = age;
	}

	public Animal(int age,String kind) {

		super();
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public Integer contarPatas() {
		
		return 4;
	}
	
	public void metodoExeption () throws  IllegalAccessException {
		
	}
}
