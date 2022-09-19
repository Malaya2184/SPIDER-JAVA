package com.spring.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.web.entities.Book;
import com.spring.web.services.BookService;

//@Controller
@RestController
public class BooksController {
	@Autowired
	BookService service;
//	@ResponseBody
//	@RequestMapping(value = "/books", method = RequestMethod.GET)
	@GetMapping("/books")
	public Book getBooks() {
		
		Book book1 = new Book(1, "spider book", "spider");
		book1.setName("malaya");
		return book1;
	}
	
	@GetMapping("/allBook")
	public List<Book> getAllBooks(){
		
		return service.getALlBook();
		
	}
}
