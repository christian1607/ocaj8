package com.celmam.ocaj.chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayLists {

	public static void main(String args[]) {

		List list23=new ArrayList<>();
		ArrayList list = new ArrayList<>();
		list.add(2);
		list.add("Cadena");
		
		System.out.println("Size list: "+list.size());


		int numero = 3;
		list.add(numero);
		list.add(true);

		System.out.println(list.toString());

		// Three ways to createe a ArrayList
		// In these cases the arraylist can be added by diferent object types,
		ArrayList list1 = new ArrayList();
		ArrayList list2 = new ArrayList(10);
		ArrayList list3 = new ArrayList(list2);

		// if you only want that a arraylist support just one data type, you must
		// especificate
		ArrayList<String> list4 = new ArrayList<String>();
		// after hava 1.7 you can else use the "diamond operator"
		ArrayList<String> list5 = new ArrayList<>();

		// Or implement the List interface
		List<String> list6 = new ArrayList<>();
		
		
		// using methods of arrarlist

		// add

		list6.add("mi primera cadena");
		list6.add(1, "mi segunda cadena");

		// In this case the code throw a exception IndexOutOfBoundsException
		// because the list6 only has two indexes 0 and 1, and if you want add a new
		// element
		// the metodo should be like this: list6.add(2, "mi segunda cadena");
		// list6.add(3, "mi segunda cadena");

		System.out.println(list6.toString());
		// remove

		list6.remove("mi segunda cadena");

		// this case the methos compares the value, for objects compares with equals()
		// method
		System.out.println(list6.toString());

		// the same as de add method, if you remove a index in an array that doesn't
		// exist, the compiler will
		// throw IndexOutOfBoundsException
		// list6.remove(3);

		// set
		// The set() method changes one of the elements of the ArrayList without
		// changing the size.
		// the same as de add method, if you set a index in an array that doesn't exist,
		// the compiler will
		// throw IndexOutOfBoundsException
		list6.set(0, "cadena mejorada");
		System.out.println(list6.toString());

		// size
		System.out.println(list6.size());

		// empty
		System.out.println(list6.isEmpty());

		// clear
		list6.clear();

		System.out.println(list6.isEmpty() ? "lista vacia" : "lista con contenidos");

		List<Integer> list7 = Arrays.asList(10, 4, -1, 5);
		Collections.sort(list7);
		Object array[] = list7.toArray();
		System.out.println(array[0]);

		List<String> one = new ArrayList<String>();
		one.add("abc");
		List<String> two = new ArrayList<>();
		two.add("abc");
		if (one == two)
			System.out.println("A");
		else if (one.equals(two))
			System.out.println("B");
		else
			System.out.println("C");

	
		
//		List<String> listaFlitrar = Arrays.asList("A","B","C","AB","1","BCD");
		List<String> listaFlitrar = new ArrayList<>();
		listaFlitrar.add("A");
		listaFlitrar.add("B");
		listaFlitrar.add("C");
		listaFlitrar.add("AB");
		listaFlitrar.add("1");
		listaFlitrar.add("BCD");
		listaFlitrar.removeIf(s->s.startsWith("A"));
		
		System.out.println(listaFlitrar);
	}

	
	
	
	
}
