package com.celmam.ocaj.chapter5.interfaces;

//An interface can extends many other interfaces
public abstract interface OperacionesMatematicas {

	public int resultado = 1;
	//El compilador transforma la expresion anterior en
	// public static final int resultado=1
	// por lo que las variables deben ser publics static y final
	
	
	public int sumar(int a, int b);

	public int restar(int a, int b);

	public int mutliplicar(int a, int b);

	public int dividir(int a, int b);

	default  String descripcion() {

		return "implementar las cuatro operaciones basicas.";
	}

	default String descripcion2() {

		return "implementar las cuatro operaciones basicas 2.";
	}

	default String descripcion3() {

		return "implementar las cuatro operaciones basicas 3.";
	}
	
	
	static int potencia() {
		return 2;
	}
	
	public static int potencia2() {
		return 2;
	}
	// private int dividir2(int a, int b);

}
