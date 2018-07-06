package com.celmam.ocaj.chapter4;

public class YetMoreInitializationOrder {

	private static int numero;
	private  int numero2;
	static {
		add(2);
	}

	static void add(int num) {
		System.out.print(num + " ");
	}

	YetMoreInitializationOrder() {
		add(5);
	}

	static {
		add(4);
		
	}

	{
		add(6);
		numero=4;
	}

	static {
		new YetMoreInitializationOrder();
	}
	static {
		add(10);
	}
	
	{
		add(8);
	}

	
	public static void main(String[] args) {
	}
}