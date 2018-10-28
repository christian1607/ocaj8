package com.celmam.ocaj.chapter4;

public class LambdaFuncionImpl2   {


	
	public String saludar(String  name,ILambdaFunction2 funcion) {
		
		return funcion.saludar()+" "+name;
	}
	
	
	public static void main(String[ ] argss) {
		
		LambdaFuncionImpl2 evaluar=new LambdaFuncionImpl2();
		//When the interface's method return type is void
		System.out.println(evaluar.saludar("Christian", ()->"Hola principe"));
		
	}
	
	
}
