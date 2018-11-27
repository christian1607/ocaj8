package com.celmam.ocaj.chapter6;

import java.io.IOException;

public class Hijo  extends Padre{

	/* This is a valid method overriden, if tyhe parent method throws a exception the child 
	 * may not declare to throw the exception.
	 * */
	@Override
	protected void comer(){
		System.out.println("Comiendo");
	}

	/*In this case, the trabajar method is overriden, even though the Padre abstract class method
	 * does not throws any kind of exception, this is because IllegalArgumentException is a RuntimeException;
	 * so the rules for override method with exception is only valid for checked exception	
	*/
	@Override
	protected void trabajar() throws IllegalArgumentException,Error{
		
		System.out.println("Trabajando");
		
	}
	
	
	public void estudiar() {
		
		try {
			System.out.println("Buscando Archivos");
		    throw new IOException("No se encontraron archivos ");
		} catch (IOException e) {
			// TODO: handle exception
		}
	}
	
	
	public static void main(String... strings) {
		Hijo christian=new Hijo();
		christian.trabajar();
		christian.comer();
			
	} 

}
