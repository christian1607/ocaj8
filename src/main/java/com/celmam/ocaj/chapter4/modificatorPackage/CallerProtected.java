package com.celmam.ocaj.chapter4.modificatorPackage;

import com.celmam.ocaj.chapter4.ModificatorAccess;

public class CallerProtected extends ModificatorAccess {

	
	public void call() {
		
		
	System.out.println(publicAttribute);
	System.out.println(protectedAttribute);
	
		
	}

	public void call2() {
		
		ModificatorAccess ma=new ModificatorAccess();
		//ma.protectedAttribute;
		// 
		
	}
	
}
