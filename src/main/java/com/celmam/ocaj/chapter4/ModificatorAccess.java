package com.celmam.ocaj.chapter4;

public class ModificatorAccess {

	/*
	 * here are 4 types of modifires in java public protected default and private
	 */
	
	
	private String privateAttribute="private";
	String defaultAttribute="default";
	protected String protectedAttribute="protected";
	public String publicAttribute="public";
	
	

	// This kind is accesible for every class
	public void methodPublic() {

		
	}

	// It's just accesible for class in the same package
	void methodDefault() {

	}

	// It's just accesible for class in the same package and subclasess (inheritance)
	protected void methodProtected() {

	}

	
	// It's accessible only inside the class
	private void methodPrivate() {

	}
	
	
	
	

}
