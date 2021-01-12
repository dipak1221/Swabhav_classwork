package com.techlab.FileReader;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter1 {

	public static void main(String[] args) {
		System.out.println();
		String s="Hello dipak how are you";
		try {
			FileWriter fs=new FileWriter("C:\\Classwork\\FileReader-FileWriter\\src\\com\\techlab\\FileReader\\Sample.txt");
		fs.write(s);
		fs.close();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
