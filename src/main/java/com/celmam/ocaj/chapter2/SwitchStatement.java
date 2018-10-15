package com.celmam.ocaj.chapter2;

public class SwitchStatement {

	public static void main(String... strings) {

		int x = 3;
		//x data type could be int and integer, char and Character, String, enum, shortand Short, byte Byte
		switch (x) {

		case 1:
			break;

		case 2:
		case 3:
			// this mean that if x is 2 or 3 it will do the same thing
			break;

		}

		//
		int dayOfWeek = 0;
		switch (dayOfWeek) {
		case 0:
			System.out.println("Sunday");
			
		case 1:
			System.out.println("Monday");	
		
		case 6:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Weekday");	
		}

	}

}
