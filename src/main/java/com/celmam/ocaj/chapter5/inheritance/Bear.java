package com.celmam.ocaj.chapter5.inheritance;

public class Bear extends Animal {

	private int age = 30;

	public Integer contarPatas() {

		return 2;
	}

	public String extingir() {

		return "Extinto OSO" ;
	}
	
	

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static String comer() {
		
		return  "comiendo carne";
	}
	
	public String queHaces() {
		
		return comer();
	}
	
	public int mostrarEdad() {
		
		
		return getAge();
	}
	
	
	public static void main(String[] arsdsdsadas) {

		Bear animal = new Bear();

		System.out.println(animal.contarPatas());
		System.out.println(animal.getAge());
		System.out.println(animal.buscarElixir());
		System.out.println(animal.queHacesAnimal());
		System.out.println(animal.queHaces());
		System.out.println(animal.mostrarEdad());
		System.out.println(animal.mostrarEdadAnimal());
		
	}

}
