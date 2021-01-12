package com.techlab.classwork;

public class EvenOdd {

	public static void main(String[] args) {
		
		System.out.print("Even no - ");
		for (int i = 0; i < args.length; i++) {
			if(Integer.parseInt(args[i])%2==0)
				System.out.print(args[i]+ ' ');
		}
		
		System.out.println();
		System.out.print("Odd no - ");
		for (int i = 0; i < args.length; i++) {
			if(Integer.parseInt(args[i])%2==1)
				System.out.print(args[i]+ " ");
		}
	}

}
