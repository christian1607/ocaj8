package com.celmam.ocaj.chapter3;

import java.util.Arrays;

public class HandlingArrays {

	
	//String... is called varargs
	public static void main (String... strings) {
		
		//there are many ways to create a array 
		int[] array1=new int[3];
		int array4[]=new int[3];
		int[] array2=new int[] {3,2,1};
		int[] array3= {2,3,4};
		
		int []sd=new int [3];
		
		
		
		
		
		//if the value of the array has not been specified, the value depend of the datatype
		// of the array, thus the next example is an array of int therefore the defautl value is 0
		System.out.println(array1[0]);
		
		
		String[] animales= {"Perro","Gato","Leon"};
		System.out.println(java.util.Arrays.toString(animales));
		
		
		//Sort 
		
		int[] numerosDesordenados= {2,3,7,5};
		String[] numeroString= {"10","9","1000"};
		
		
	
		Arrays.sort(numeroString);
		Arrays.sort(numerosDesordenados);
		Arrays.sort(animales);
		System.out.println("@@@@"+Arrays.binarySearch(numeroString, "1000"));
		
		
		System.out.println(Arrays.toString(numeroString));
		System.out.println(Arrays.toString(numerosDesordenados));
		System.out.println(Arrays.toString(animales));
		
		
		String[] scores = new String[5];
//		scores.length;
		int tamanio=scores.length;
		
		int[][] java = new int[0][];
		
	}
	
}
