package com.celmam.ocaj.chapter5.abstraction;

public class Circle extends Shape {

	@Override
	public Integer cantidadLados() {
		return 2;
	}
	
	

	@Override	
	public double area() {
		return 2.0;
	}



	@Override
	protected double area2() {
		return 0;
	}



	//this method is not mandatory to implements because the abstract parent class has already implemented it
	@Override
	public String queSoy() {
		// TODO Auto-generated method stub
		return "I'm circle ";
	}

	

}
