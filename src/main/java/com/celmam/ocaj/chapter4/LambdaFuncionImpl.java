package com.celmam.ocaj.chapter4;

import java.util.function.Predicate;

public class LambdaFuncionImpl   {

	/* Lambda functions only works if the interface has only one method
	 * */
	
	public boolean isFunction(String  name,ILambdaFunction funcion) {
		
		try {
			return funcion.isLambdaFunction(name);
		} catch (Exception e) {
			return false;
		}
	}
	
	
	public static void main(String[ ] argss) {
		
		LambdaFuncionImpl evaluar=new LambdaFuncionImpl();
		//there are multiple ways to implement a lambda function
		System.out.println(evaluar.isFunction("lambda", (String a)->{return a.equals("lambda");}));
		System.out.println(evaluar.isFunction("lambda", a->{return a.equals("lambda");}));
		System.out.println(evaluar.isFunction("lambda", (String a)->a.equals("lambda")));
		System.out.println(evaluar.isFunction("lambda",  a-> a.equals("lambda")));

		System.out.println(evaluar.isFunction("lambda", (String a)->{return a.equals("lambda");}));
		
		//Invalid syntax
//		System.out.println(evaluar.isFunction("lambda", String a->{return a.equals("lambda");}));
//		System.out.println(evaluar.isFunction("lambda",  a-> {a.equals("lambda")}));
//		System.out.println(evaluar.isFunction("lambda",  a-> {a.equals("lambda");}));
	
		//Predicates 
		
		Predicate<String> verificar=(t)->t.equals("christian");
		if(verificar.test("anddy")) {
			System.out.println("correcto");
		}else {
			System.out.println("incorrecto");
		}
			
	
		
		Predicate<Integer> esPar=value1->value1%2==0;
		
		System.out.println("El numero es "+(esPar.test(2)?"Par":"Impar"));
	}
	
	
}
