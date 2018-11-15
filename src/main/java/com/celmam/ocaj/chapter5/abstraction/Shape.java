package com.celmam.ocaj.chapter5.abstraction;

public abstract class Shape {

	
	public String queSoy() {
	 return "Figura Geometrica";
	}
	

	//A abstract class may have concrete methods
	public Number cantidadLados() {
		return 0;
	}
	
	public abstract double area();
	protected abstract double area2();
	
	// an abstract method only can be public or protected, private access will generate a compile error
	//private abstract double area2();
	
	
	
}
