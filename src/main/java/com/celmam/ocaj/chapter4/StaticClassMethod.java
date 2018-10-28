package com.celmam.ocaj.chapter4;

//Static import
import static java.util.Arrays.asList;

import java.util.ArrayList;
import java.util.List;

public class StaticClassMethod {

	public static int contador = 0;
	public static final int contador2;
	// static field must be initialized, or you can initialize in the static initialize, otherwise
	// you get a compiler error.
	public static final int contador3;
	public static final int contadorFijo = 0;
	private int edad=25;
	public static final List<String> lista =new ArrayList<>();
	public static StringBuilder builder=new StringBuilder();

	static {
		System.out.println("first static initializer");
		// contadorFijo=2;
		contador = 2;
		contador = 3;
		contador2 = 3;
		contador3=2;
		//a final attribute justcan be initialize once, otherwise a compiler error will ocurr
		//contador3=2;

		lista.add("nica warrita");
		lista.add("nica cachera");
		
		builder.append("OCAJ8");
	}
	static {
		StaticClassMethod sm=new StaticClassMethod();
		sm.imprimir();
		System.out.println("Second static initializer");
		System.out.println(builder);
		// contadorFijo=2;
		contador = 2;
		contador = 3+contador2;
		
	
	}

	public static void main(String... strings) {
		System.out.println("Iniciando...");
		StaticClassMethod classMethod = new StaticClassMethod();

		System.out.println("contador: "+classMethod.contador);
		classMethod = null;
		System.out.println("contador: "+classMethod.contador);

		// This is a method that is a static import
		List<Integer> listanumeros = asList(2, 34, 5);
	}

	public void imprimir() {
		System.out.println("Imprimiendo EPSON-t35 ");
		
	}
	
}
