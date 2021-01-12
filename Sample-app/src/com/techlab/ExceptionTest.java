package com.techlab;

public class ExceptionTest {

	public static void main(String[] args) {
		// passing CLA as 3
		int a=Integer.parseInt(args[0]); //3
		int b=Integer.parseInt(args[1]);// no arg passing from CLA
		int c=a/b;
		
		System.out.println("Result is = "+c);
		System.out.println("End of the program");

	}

}
