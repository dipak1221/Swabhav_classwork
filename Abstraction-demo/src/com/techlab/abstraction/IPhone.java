package com.techlab.abstraction;

public class IPhone extends Phone {

	@Override
	public void call() {
	System.out.println("Iphone call setting");
	}

	@Override
	public void camera() {
		System.out.println("Iphone camera setting");
	}

}
