package com.techlab.project2;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		String ss;
		Scanner sc = new Scanner(System.in);
		ss=sc.nextLine();
		String m[] = ss.split(" ");
		for (String string : m) {
			if(string!="")
			System.out.println(string.trim());
		}
	}

}
