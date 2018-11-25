package com.celmam.ocaj.chapter6;



/*
 * RuntimeExceptions=unchecked Exceptions
 * Exception subclass = checked exceptions
 * */
public class MyException extends Exception{

	
	
	//Este es una implementacion basica del try catch
	public void metodo1() {

		try {
			
		} catch(Exception e) {
			// TODO: handle finally clause
		}
	}
	
	
	//No es necesario agregar la sentencia catch si se cuenta con finally
	public void metodo2() {

		try {
			
		} finally {
			
		}
	}
	
	
	//Se puede armar un try catch finally (En ese orden)
	public void metodo3() {

		try {
			
		} catch(Exception e) {
			
		}
		finally {
			
		}
	}
}
