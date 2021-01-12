package com.techlab.simple.factory;

public class AutoMobileFactory {
 public IAutoMobile make(AutoType type) {
	if(type==AutoType.BMW)
		return new BMW();
	if(type==AutoType.AUDI)
		return new Audi();
	
	return new Tesla();
	
 }
}
