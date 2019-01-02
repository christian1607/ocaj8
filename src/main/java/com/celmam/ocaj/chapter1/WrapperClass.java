package com.celmam.ocaj.chapter1;

public class WrapperClass {

	
	public static void main(String[] args) {
		
		
		
		
		
		Double numero=new Double(2.3);
		numero=Double.valueOf("2.3");
		
		System.out.println(numero);
				
		numero=Double.valueOf(" 5.8 ");
		
		System.out.println(numero);
		System.out.println(Double.parseDouble(" 3.8 "));
	
		
		
		//Boolean
		//This return a boolean primitve
		System.out.println(Boolean.parseBoolean("true"));
		
		//These return a Boolean class
		System.out.println(Boolean.valueOf("true"));
		System.out.println(Boolean.valueOf(true));
		System.out.println(Boolean.TRUE);
		
		
		
		System.out.println(new Integer(4) + new Integer(3));
		System.out.println(new Integer(4) +3);
		
		
	}
	
	
	public float parseFloat( String s ){
	     float f = 0.0f;      // 1
	     try{
	          f = Float.valueOf( s ).floatValue();    // 2
	          return f ;      // 3
	     }
	     catch(NumberFormatException nfe){
	        f = Float.NaN ;    // 4
	       return f;     // 5
	     }
	     finally {
	         return f;     // 6
	     }
	     return f ;    // 7
	 }
	
}
