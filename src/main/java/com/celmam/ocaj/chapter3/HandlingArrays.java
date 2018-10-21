package com.celmam.ocaj.chapter3;

import java.util.Arrays;

import com.celmam.ocaj.chapter5.inheritance.Animal;
import com.celmam.ocaj.chapter5.inheritance.Bear;
import com.celmam.ocaj.chapter5.inheritance.Lion;

public class HandlingArrays {

	
	//String... is called varargs
	public static void main (String... strings) {
		
		//there are many ways to create a array 
		
		//one dimention
		int[] array1=new int[3];
		int array4[]=new int[3];
		
		System.out.println("Array: "+array1.equals(array4));
		
		
		int[] array2=new int[] {3,2,1};
		int[] array3= {2,3,4};
		
		// puede estar pegado, la instancia significa el tamanio del array int[3]=3 ==> 0, 1, 2
		int []array=new int [3];
		int array7[]=new int [3];
		
		
	
		array1[0]=1;
		array1[1]=2;
		array1[2]=Integer.valueOf("3");
		
		//array1[3]=Integer.valueOf("5");	java.lang.ArrayIndexOutOfBoundsException
		
		
		System.out.println("Array: "+array1[0]);
		System.out.println("Array: "+array1[1]);
		System.out.println("Array: "+array1[2]);
		
		
		
		//if the value of the array has not been specified, the value depend of the datatype
		// of the array, thus the next example is an array of int therefore the defautl value is 0
		System.out.println(array1[0]);
		
		
		String[] animales= {"Perro","Gato","Leon"};
		System.out.println(java.util.Arrays.toString(animales));
		
		
		System.out.println(animales.length);
		Animal animals[]=new Animal[3];
		animals[0]=new Bear();
		animals[1]=new Lion();
		animals[1]=new Animal();
		
		System.out.println("Cantidad de animales"+animals.length);
		
		
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
		
		
		//multiple dimetion
		int[][] java = new int[0][];
		int[] intNumber[]=new int[1][2];
		int intNumber2[][]=new int[8][2];
		int intNumber3[][]= {{1,3},{2,3}};
		
	}
	
}
