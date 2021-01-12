package com.techlab.exception.test;

import com.techlab.custom.exception.CustomException;

public class ExceptionTest {

	public static void main(String[] args) {
		Integer k=12;
		CustomException cs=new CustomException();
		
		try{
			cs.validate(13);
		}catch (Exception e) {
			System.out.println("Exception = "+e);
		}
		System.out.println("End of program");
	}

}
