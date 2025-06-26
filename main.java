package com.elevateLabs;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Library library = new Library();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String name = sc.nextLine();
		
		System.out.print("Enter your ID: ");
		int id = sc.nextInt();
		sc.nextLine();
		
		User user = new User(name , id);
		System.out.println("\nWelcome to the Library , "+ name +"!");
		user.displayInfo();
		
		while(true) {
			System.out.println("\nMenu");
			System.out.println("1. Add book");
			System.out.println("2. Show all books");
			System.out.println("3. Issue book");
			System.out.println("4. Return book");
			System.out.println("5. Exit");
			
			System.out.print("Enter your choice: ");
			int choice =sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1:
				System.out.print("Enter Book title: ");
				String title = sc.nextLine();
				System.out.print("Enter Author name: ");
				String author = sc.nextLine();
				
				library.addBook(new Book(title,author));
				break;
				
			case 2:
				library.showAllBooks();
				break;
				
			case 3: 
				System.out.print("Enter book title: ");
				String issuetitle = sc.nextLine();
				library.issueBook(issuetitle);
				break;
				
			case 4:
				System.out.print("Enter book title to return: ");
				String returnTitle= sc.nextLine();
				library.returnBook(returnTitle);
				break;
				
			case 5:
				System.out.println("Exiting the system....!");
				sc.close();
				return ;
				
			default:
				System.out.println("Invalid choice!");
				
			}
		}

	}

}
