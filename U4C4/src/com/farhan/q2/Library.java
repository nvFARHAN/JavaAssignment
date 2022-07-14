package com.farhan.q2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Library {
	List<Book> bookList = new ArrayList<>();

	public void addBook(Book book) {
		bookList.add(book);
	}

	public boolean isEmpty() {
		if (bookList.isEmpty())
			return true;
		else
			return false;
	}

	public List<Book> viewAllBooks() {
		Set<Book> allBooks = new HashSet<>(bookList);
		return new ArrayList<Book>(allBooks);
	}

	public List<Book> viewBooksByAuthor(String author) {
		List<Book> byAuthor = new ArrayList<>();
		for (Book b : bookList) {
			if (b.getAuthor().equals(author))
				byAuthor.add(b);
		}
		return byAuthor;
	}

	public int countNoOfBook(String bookName) {
		int count = 0;
		for (Book b : bookList) {
			if (b.getBookName() == bookName)
				count++;
		}
		return count;
	}
}
