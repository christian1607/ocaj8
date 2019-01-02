package com.celmam.ocaj.chapter5.inheritance;

public class SharingVariables {
	
	public static void main(String[] args) {
		A a = new A();//1
		A b = new B();//2
		
	
		System.out.println(b.i);
	}
	
}

class A{
	public int i = 10;
   public void  f(){}
   public void g(){}
}

class B extends A{
   private int i = 20;
   public void g(){}
}

class C{
   A a = new A();//1
   A b = new B();//2
}