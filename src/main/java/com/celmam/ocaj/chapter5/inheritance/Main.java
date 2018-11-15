package com.celmam.ocaj.chapter5.inheritance;

public class Main {

	
	
	public static void main(String []args) {
		
		
		Lion leon=new Lion();
		leon.mostrarEdadAnimal();
		
		Animal animal=new Lion();
		animal.mostrarEdadAnimal();
		animal.queHacesAnimal();
	}
	
}
