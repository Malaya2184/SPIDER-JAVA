package com.spring.web.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.web.entities.Book;

@Service
public class BookService {

	public static List<Book> allBooks = new ArrayList<>();
	
	static {
		allBooks.add(new Book(1, "abc", "def"));
		allBooks.add(new Book(2, "bbc", "eef"));
		allBooks.add(new Book(3, "cbc", "fef"));
		allBooks.add(new Book(4, "dbc", "gef"));
		allBooks.add(new Book(5, "ebc", "hef"));
	}
	
	public List<Book> getALlBook(){
		return this.allBooks;
	}
}
