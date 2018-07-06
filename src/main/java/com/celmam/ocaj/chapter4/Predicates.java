package com.celmam.ocaj.chapter4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Predicates {

	
	public boolean comparar(Predicate<String> function,String palabra) {
		
		
		return function.test(palabra);
	}
	
	
	public static void main(String args[]) {
		
		
		Predicates function=new Predicates();
		
		System.out.println(function.comparar( a->a.equals("jose"),"jose"));		
		
		List<String> list = new ArrayList<>();
		list.removeIf((String s) -> s.isEmpty());
	}
}
