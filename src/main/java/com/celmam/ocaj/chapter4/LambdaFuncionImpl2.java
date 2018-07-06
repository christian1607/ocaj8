package com.celmam.ocaj.chapter4;

public class LambdaFuncionImpl2   {


	
	public String saludar(String  name,ILambdaFunction2 funcion) {
		
		return funcion.saludar();
	}
	
	
	public static void main(String[ ] argss) {
		
		LambdaFuncionImpl2 evaluar=new LambdaFuncionImpl2();
		System.out.println(evaluar.saludar("as",new ILambdaFunction2() {
			
			@Override
			public String saludar() {
				// TODO Auto-generated method stub
				return "assa";
			}
		}  ));
		
	}
	
	
}
