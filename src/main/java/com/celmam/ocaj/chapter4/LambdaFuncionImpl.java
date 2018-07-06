package com.celmam.ocaj.chapter4;

public class LambdaFuncionImpl   {


	
	public boolean isFunction(String  name,ILambdaFunction funcion) {
		
		return funcion.isLambdaFunction(name);
	}
	
	
	public static void main(String[ ] argss) {
		
		LambdaFuncionImpl evaluar=new LambdaFuncionImpl();
		System.out.println(evaluar.isFunction("lambda", (String a)->{return a.equals("lambda");}));
		
	}
	
	
}
