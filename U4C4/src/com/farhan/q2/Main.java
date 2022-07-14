package com.farhan.q2;

import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Library l = new Library();
		while (true) {
			System.out.println("1.Add book");
			System.out.println("2.Display all book details");
			System.out.println("3.Search book bt author");
			System.out.println("count number of books - by book name");
			System.out.println("5.Exit");
			System.out.println("Enter your choice : ");
			int c = sc.nextInt();
			sc.nextLine();
			if (c == 1) {
				Book b = new Book();
				System.out.println("Enter the isbn no : ");
				b.setIsbn(sc.nextInt());
				sc.nextLine();
				System.out.println("Enter the book name : ");
				b.setBookName(sc.nextLine());
				System.out.println("Enter the author name : ");
				b.setAuthor(sc.nextLine());
				l.addBook(b);
				System.out.println("Book added successfully");
			} else if (c == 2) {
				List<Book> books = l.viewAllBooks();
				if (books.isEmpty()) {
					System.out.println("No books in library");
				}
				for (Book b : books) {
					System.out.println("ISBN No. : " + b.getIsbn());
					System.out.println("Book Name : " + b.getBookName());
					System.out.println("Author Name : " + b.getAuthor());
				}
			} else if (c == 3) {
				System.out.println("Enter the author name : ");
				String author = sc.nextLine();
				List<Book> books = l.viewBooksByAuthor(author);
				if (books.isEmpty()) {
					System.out.println("None of the book published by the author " + author);
				}
				for (Book b : books) {
					System.out.println("ISBN No. : " + b.getIsbn());
					System.out.println("Book Name : " + b.getBookName());
					System.out.println("Author Name : " + b.getAuthor());
				}
			} else if (c == 4) {
				System.out.println("Enter book name : ");
				String bookName = sc.nextLine();
				int count = l.countNoOfBook(bookName);
				System.out.println("Number of books : " + count);
			} else if (c == 5) {
				System.out.println("Thank You..!!");
				break;
			}
		}

	}

}
