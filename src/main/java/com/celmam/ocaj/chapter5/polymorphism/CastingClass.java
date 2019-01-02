package com.celmam.ocaj.chapter5.polymorphism;



public class CastingClass {

	
	Padre p1=new Hijo();
	
	Hijo h = (Hijo)p1;
	
	Hijo2 h2=(Hijo2)h;
}


class Padre{
	
	
}

class Hijo extends Padre{
	
	
}



class Hijo2 extends Padre{
	
	
	
}