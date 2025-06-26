package com.elevateLabs;

import java.util.ArrayList;

public class Library {
	private ArrayList<Book> books = new ArrayList<Book>();
	
	public void addBook(Book book) {
		books.add(book);
		System.out.println("Added: "+ book.getTitle());
	}
	
	public void showAllBooks() {
		if(books.isEmpty()) {
			System.out.println("No books available");
		}
		
		for (Book book : books) {
			System.out.println(book);
		}
	}
	
	public void issueBook(String title) {
		for (Book book : books) {
			if(book.getTitle().equalsIgnoreCase(title)) {
				if(!book.isIssued()) {
					book.issue();
					System.out.println("Book issued: "+ title);
				}else {
					System.out.println("Book already issued.");
				}
				return ;
			}
		}
		System.out.println("Book not found.");
	}
	
	public void returnBook(String title) {
		for (Book book : books) {
			if(book.getTitle().equalsIgnoreCase(title)) {
				if(book.isIssued()) {
					book.returnBook();
					System.out.println("Book returned: "+ title);
				}else {
					System.out.println("Book was not issued.");
				}
				return ;
			}
		}
		System.out.println("Book not found.");
	}
	
}
