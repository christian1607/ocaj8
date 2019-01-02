package com.celmam.ocaj.chapter5.interfaces.item1;

public class MiembroFamilia implements ITareaHijo,ITareaPadre{

	
	
	public void saludar() {
		
		
	}
	
	
	
	public static void main(String args[]) {
	
		ITareaHijo tarea= new MiembroFamilia();
		System.out.println(tarea.saludarFamilia());
		
		ITareaPadre tarea2= new MiembroFamilia();
		System.out.println(tarea2.saludarFamilia());
		
		
		
	}
	
}
