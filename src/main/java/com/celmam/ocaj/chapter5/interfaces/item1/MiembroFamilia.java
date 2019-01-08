package com.celmam.ocaj.chapter5.interfaces.item1;



interface ITareaPadre {

		
	public default String saludarFamilia() {
		
		return "Buenos dias Familia";
	}
	
	
	public static String comer() {
		
		return "comiendo";
	}
}


interface ITareaHijo {

	public default String saludarFamilia() {

		return "Buenos dias Mama y Papa";
	}

	public static String comer() {

		return "comiendo";
	}
}


/*
 * A static method of a interface just can be called by the interface name (Interface.method())
 * this also allows to class to implements both interfaces with the same name without a compile error. 
 * */



/*
 * If a class implements many interfaces which every interface has default methods, the name of those methods
 * can't be the same otherwise a compiler error will occur
 * */
public class MiembroFamilia implements ITareaHijo,ITareaPadre{

	
	
	public void saludar() {
		
		
	}
	
	
	
	public static void main(String args[]) {
	
		ITareaHijo tarea= new MiembroFamilia();
		System.out.println(tarea.saludarFamilia());
		
		ITareaPadre tarea2= new MiembroFamilia();
		System.out.println(tarea2.saludarFamilia());
		
		
		ITareaHijo.comer();
		
		
	}
	
}
