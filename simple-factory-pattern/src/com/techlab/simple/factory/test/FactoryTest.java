package com.techlab.simple.factory.test;
import com.techlab.simple.factory.*;
public class FactoryTest {

	public static void main(String[] args) {
		AutoMobileFactory factory=new AutoMobileFactory();
		IAutoMobile bmw=factory.make(AutoType.BMW);
		bmw.start();
		bmw.stop();
		
		IAutoMobile audi=factory.make(AutoType.AUDI);
		audi.start();
		audi.stop();
//		AutoMobileFactory factory1=new AutoMobileFactory();
		IAutoMobile tesla=factory.make(AutoType.TESLA);
		tesla.start();
		tesla.stop();	
	}

}
