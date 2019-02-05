package com.celmam.ocaj.chapter2;

public class IfElse {

	public static void main(String... strings) {

		int x = 0;

		if (++x > 0) {
			System.out.println("X=" + x);
		} else {
			System.out.println("Aun no es asignado");
		}

		if (true)
			System.out.println("Printig inside if block");
		System.out.println("Priting outside if block");

		if (false)
			System.out.println("Printig inside if block");
		System.out.println("Priting outside if block");

	}
	
	public static void ifTest(boolean flag){
		   if (flag)   //1
		   if (flag)   //2
		   if (flag)   //3
		   System.out.println("False True");
		   else        //4
		   System.out.println("True False");
		   else        //5
		   System.out.println("True True");
		   else        //6
		   System.out.println("False False");
		   
		   /* Es similar a esto
		    * if (flag)      //1
			   {
			       if (flag)       // 2
			       {
			            if (flag)        //3
			            {
			                  System.out.println("False True");
			            }
			            else            //4
			            {
			                  System.out.println("True False");
			            }
			       }
			       else           //5
			       {
			             System.out.println("True True");
			       }
			   }
			  else           //6
			  {
			        System.out.println("False False");
			   }
		    * */
	}

}
