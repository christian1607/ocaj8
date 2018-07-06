package com.celmam.ocaj.chapter2;

public class SwitchStatement {

	public static void main(String... strings) {

		int x = 3;
		switch (x) {

		case 1:
			break;

		case 2:
		case 3:
			// this mean that if x is 2 or 3 it will do the same thing
			break;

		}

		//
		int dayOfWeek = 5;
		switch (dayOfWeek) {
		case 0:
			System.out.println("Sunday");
		
		case 6:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Weekday");	
		}

	}

}
