package com.techlab.library;

public class LibraryTest {

	public static void main(String[] args) {
		Book[] b=new Book[3];
		b[0]=new Book("abc","sam");
		b[1]=new Book("abc1","sam1");
		b[2]=new Book("abc2","sam3");
		
		Library lb=new Library(b);
		
		Book[] a=lb.getBook();
		
		for (Book book : a) {
			System.out.println(book.toString());
		}
		

	}

}
