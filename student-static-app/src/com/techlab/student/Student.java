package com.techlab.student;

public class Student {
	private int id;
	private String name;
	static private int counter=0;
	
	public Student() {
		counter++;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getCounter() {
		return counter;
	}
	
	

}
