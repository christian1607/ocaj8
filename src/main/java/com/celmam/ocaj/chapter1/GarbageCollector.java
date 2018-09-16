package com.celmam.ocaj.chapter1;

public class GarbageCollector {

	
	
	
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Finalizando Objeto by Garbage Collector");
		super.finalize();
	}

	public static void main (String args[]) {
		
		GarbageCollector gc=new GarbageCollector();
		
		System.gc();
		
	}
	
}
