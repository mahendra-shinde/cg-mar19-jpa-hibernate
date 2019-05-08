package com.cg.dao;

import java.util.List;

import com.cg.entities.Book;

public class Main {

	public static void main(String[] args) {
		BookDAO dao = new BookDAOImpl();
		
		System.out.println("Test find by ID");
		Book book = dao.getBookById(102);
		System.out.println("Book found: "+book.getTitle());
		
		System.out.println("Test find by title");
		List<Book> books = dao.getBookByTitle("Pro Java 8");
		System.out.println("Book found from author "
				+books.get(0).getTitle());

	}

}
