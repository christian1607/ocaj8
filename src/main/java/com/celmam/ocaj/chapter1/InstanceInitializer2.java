package com.celmam.ocaj.chapter1;

public class InstanceInitializer2 {


	private String nombre=setearValor();;
	
	
	{
		ajustarValor();
		
	}
	
	
	void ajustarValor() {
		System.out.println("primero ajustarValor");
		this.nombre="Christian";
	}
	
	String setearValor() {
		System.out.println("primero setearValor");
		return "Anddy";
	}
	
	public static void main(String[] args) {
		InstanceInitializer2 i=new InstanceInitializer2();
		System.out.println(i.nombre);
		
	}
}
