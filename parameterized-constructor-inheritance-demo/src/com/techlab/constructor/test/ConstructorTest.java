package com.techlab.constructor.test;

import com.techlab.constructor.Child;

public class ConstructorTest {

	public static void main(String[] args) {
		Child a1=new Child(100);
		System.out.println(a1.getFoo());
		
		Child a2=new Child(200);
		System.out.println(a2.getFoo());
		
		Child a3=new Child(300);
		System.out.println(a3.getFoo());
		
		

	}

}
