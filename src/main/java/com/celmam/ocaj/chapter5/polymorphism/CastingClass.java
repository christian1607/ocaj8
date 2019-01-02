package com.celmam.ocaj.chapter5.polymorphism;



public class CastingClass {

	public static void main(String[] args) {
		Padre p1=new Hijo();
		
		Hijo h = (Hijo)p1;
		
		//Hijo2 h2=(Hijo2)h;
		
		Padre i =(Padre)(I)p1;
		
	}
	
}


interface I{
}

class Padre implements I{
	
	
}

class Hijo extends Padre{
	
	
}



class Hijo2 extends Padre{
	
	
	
}