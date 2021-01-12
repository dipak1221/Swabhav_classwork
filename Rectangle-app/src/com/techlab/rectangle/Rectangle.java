package com.techlab.rectangle;
public class Rectangle {
	
	private float length;
	private float breadth;

	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}	
	public Rectangle(float length, float breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public float getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public float getBreadth() {
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
}
