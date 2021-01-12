package com.techlab.abstraction;

public class Samsung extends Phone{

	@Override
	public void call() {
		System.out.println("Samsung call setting");
	}

	@Override
	public void camera() {
		System.out.println("Samsung camera setting");
	}

}
