package com.techlab.abstraction.test;

import com.techlab.abstraction.IPhone;
import com.techlab.abstraction.Phone;
import com.techlab.abstraction.Samsung;

public class AbstractionTest {

	public static void main(String[] args) {
		IPhone ip=new IPhone();
		Samsung s=new Samsung();
		repair(ip);
		repair(s);
		
	}
	public static void repair(Phone p)
	{
		p.call();
		p.camera();
	}
}
