package com.techlab.classwork;

public class ArrayTest {

	public static void main(String[] args) {
		int sum=0;
	
		for (int i = 0; i < args.length; i++) {
			sum=sum+add(Integer.parseInt(args[i]));
		}
System.out.println("Sum is = "+sum);

	}
	static int add(int a){
		return a;}
	

}

