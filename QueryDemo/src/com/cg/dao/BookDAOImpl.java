package com.cg.dao;

import java.util.List;

import javax.persistence.*; //To Ensure using correct Interfaces/Classes

import com.cg.entities.Book;

public class BookDAOImpl implements BookDAO {
private EntityManager em = JPAUtil.getEntityManager();
	
	@Override
	public Book getBookById(Integer id) {
		// TODO Auto-generated method stub
		return em.find(Book.class, id);
	}

	@Override
	public List<Book> getBookByTitle(String title) {
		//JPQL Query with Named Parameter "title"
		Query q = em.createQuery("select b from Book b "
				+"  where lower(b.title) like lower(:title)");
		// Assign values to ALL parameters
		q.setParameter("title", "%"+title+"%");
		return q.getResultList();
	}

	@Override
	public List<Book> getBookByAuthor(String author) {
		Query q = em.createQuery("select b from Book b where b.author=:author");
		q.setParameter("author", author.trim());
		return q.getResultList();
	}

	@Override
	public Long countBooks() {
		Query q = em.createQuery("select count(b) from Book b"); 
		return (Long) q.getSingleResult();
	}

	@Override
	public List<Book> getAllBooks() {
		Query q = em.createQuery("select b from Book b");
		return q.getResultList();
	}

	@Override
	public List<Book> getBooksInPriceRange(Float min, Float max) {
		TypedQuery<Book> q = em.createQuery
				("select b from Book b where b.price between :min and :max"
						,Book.class);
		q.setParameter("min", min);
		q.setParameter("max", max);
		return q.getResultList();
	}

}
