package com.cg.dao;

import java.util.List;

import com.cg.entities.Book;

public interface BookDAO {

	Book getBookById(Integer id);
	List<Book> getBookByTitle(String title);
	List<Book> getBookByAuthor(String author);
	Long countBooks();
	List<Book> getAllBooks();
	List<Book> getBooksInPriceRange(Float min,Float max);
}
