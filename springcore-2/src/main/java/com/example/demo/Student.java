package com.example.demo;

public class Student {

	private Book book;
	private  String bookname;

	// by using setter injection
	
//	public void setBook(Book book) {
//		this.book = book;
//	}
	
	
	// by using constructor injection
	
	public Student(Book book, String bookname) {
		super();
		this.book = book;
		this.bookname = bookname;
	}

	

	public void readbook() {
		book.readbook();
		System.out.println("name of the book is :"+bookname);
	}

	


}
