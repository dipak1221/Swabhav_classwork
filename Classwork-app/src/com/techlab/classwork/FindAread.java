package com.techlab.classwork;
public class FindAread {

	static float calculateArea(int radius){
		return (float) (Math.PI*radius*radius);
	}
	static int calculateArea(int length,int height){
		return length*height;
	}
	static float calculateArea(float base ,float height){
		return (float)(0.5*base*height);
	}
	static float calculateArea(float side){
		return (float)side*side;
	}
	
	public static void main(String[] args) {
		System.out.println("Area of square ="+calculateArea(5));
		System.out.println("Area of triangle ="+calculateArea(2.0f,3f));
		System.out.println("Area of rectangle ="+calculateArea(5,6));
		System.out.println("Area of circle ="+calculateArea(2));
		
	}
}
