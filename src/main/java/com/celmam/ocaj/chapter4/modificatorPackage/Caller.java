package com.celmam.ocaj.chapter4.modificatorPackage;

import com.celmam.ocaj.chapter4.ModificatorAccess;

public class Caller {

	
	public static void main(String[] sdsd) {

		ModificatorAccess ma=new ModificatorAccess();

			
		System.out.println(ma.publicAttribute);
		ma.methodPublic();
		
	
		//In this case we only can call public method and attribute, because this class doesn't 
		//belong to the same package as ModificatoAccess
		

	}

}
