package com.celmam.ocaj.chapter5.inheritance;

public class Animal {

	private int age = 10;

	public Animal() {
	}

	public Animal(int age) {
		super();
		this.age = age;
	}

	public Animal(int age, String kind) {
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
		return 0;
	}

	public final String buscarElixir() {
		return "Just be happy";
	}

	private String extingir() {
		return "Extinto";
	}

	public static String comer() {
		System.out.println("Animal comiendo");
		return "comiendo";
	}

	public static String queHacesAnimal() {
		return comer();
	}

	public final int mostrarEdadAnimal() {
		System.out.println("Mi edad es: "+ getAge());
		return getAge();
	}

	public void metodoExeption() throws IllegalAccessException {

	}
}
