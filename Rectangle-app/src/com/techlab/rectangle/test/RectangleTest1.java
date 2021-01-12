package com.techlab.rectangle.test;

import com.techlab.rectangle.Rectangle;

public class RectangleTest1 {

	public static void main(String[] args) {
		Rectangle[] r=new Rectangle[3];
		Rectangle r1=new Rectangle(2,3);
		r1.setBreadth(2);
		r1.setLength(4);
		
		Rectangle r2=new Rectangle(3,4);
		r2.setBreadth(12);
		r2.setLength(40);
		
		r[0]=new Rectangle(4,5);
		r[0].setBreadth(344344);
		
	
		printrectangleInfo(r[0]);
//		printrectangleInfo(r2);
		
	}
	public static void printrectangleInfo(Rectangle r)
	{
	System.out.println("length is "+r.getLength());
	System.out.println("Breadth is "+r.getBreadth());
	}

}
