package com.celmam.ocaj.chapter3.arrays;

public class ArrayOperations {

	
	public static void main(String[] args) {
		
		int[] a= {1,2,3,4};
		int[] b= {4,3,2,1};
			
		System.out.println(a[(a=b)[3]]);
		System.out.println(a[1]);
		
		
		int as=5;
		as=(as=3)+3;
		System.out.println(as);
		
	}
}
