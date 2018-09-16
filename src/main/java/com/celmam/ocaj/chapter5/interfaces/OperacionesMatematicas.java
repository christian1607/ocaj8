package com.celmam.ocaj.chapter5.interfaces;

public abstract interface OperacionesMatematicas {

	public int resultado = 1;

	public int sumar(int a, int b);

	public int restar(int a, int b);

	public int mutliplicar(int a, int b);

	public int dividir(int a, int b);

	default  String descripcion() {

		return "implementar las cuatro operaciones basicas.";
	}

	default String descripcion2() {

		return "implementar las cuatro operaciones basicas.";
	}

	default String descripcion3() {

		return "implementar las cuatro operaciones basicas.";
	}
	
	
	static int potencia() {
		
		return 2;
	}
	// private int dividir2(int a, int b);

}
