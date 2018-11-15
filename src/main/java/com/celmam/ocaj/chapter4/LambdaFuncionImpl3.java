package com.celmam.ocaj.chapter4;

public class LambdaFuncionImpl3   {


	
	public String saludar(String  name,LambdaFunction3 funcion) {
		
		 funcion.est(name, 1);
		 return "";
	}
	
	
	public static void main(String[ ] argss) {
		
		LambdaFuncionImpl3 evaluar=new LambdaFuncionImpl3();
		//When the interface's method return type is void
		System.out.println(evaluar.saludar("Christian", (a, b)->{}));
		
	}
	
	
}
