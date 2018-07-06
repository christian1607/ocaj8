package com.celmam.ocaj.chapter4;

public class ModificatorAccessCaller {

	public static void main(String[] sdsd) {

		ModificatorAccess ma=new ModificatorAccess();
//		As you can see, it's imposible to call that has a private access
//		ma.methodPrivate();
//		ma.privateAttribute;
		
		
		System.out.println(ma.defaultAttribute);
		System.out.println(ma.protectedAttribute);
		ma.methodDefault();

	}

}
