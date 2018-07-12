package com.celmam.ocaj.chapter5.interfaces;

public class Alumno implements OperacionesMatematicas {

	@Override
	public int sumar(int a, int b) {

		return (a + b) ;

	}


	
	@Override
	public int restar(int a, int b) {
		return (a - b) * resultado;
	}

	@Override
	public int mutliplicar(int a, int b) {
		return (a * b) * resultado;
	}

	@Override
	public int dividir(int a, int b) {
		return (a / b) * resultado;
	}
	
	
	
	
	public static void main (String args[]) {
		
			OperacionesMatematicas alumno1=new Alumno();
			
			System.out.println(alumno1.sumar(4, 2));
			System.out.println(alumno1.restar(4, 2));
			System.out.println(alumno1.mutliplicar(4, 2));
			System.out.println(alumno1.dividir(4, 2));
			System.out.println(alumno1.descripcion());
		
	}

}
