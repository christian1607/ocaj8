package com.celmam.ocaj.chapter6;


//If a reference of a exception is throw, then the exception will be a NullpointerException
// noo matter what kind of exception the program throws.
public class ExceptionNull {

	public static void main(String args[]) {
		try {
			Exception re = null;
			throw re;
		} catch (Exception e) {
			System.out.println("Exception: "+e);
		}
	}

}
