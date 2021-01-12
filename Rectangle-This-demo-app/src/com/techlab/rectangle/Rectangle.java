package com.techlab.rectangle;

public class Rectangle {

	private float length;
	private float breadth;
	private String color;
	
	public Rectangle(String color){
		this.color=color;
	}
	
	public Rectangle(float length, float breadth, String color) {
		this(color); //chaining
		this.length = length;
		this.breadth = breadth;
		
	}
	public float getLength() {
		return length;
	}
	public float getBreadth() {
		return breadth;
	}
	public String getColor() {
		return color;
	}
	
	
}
