package com.cg.entities;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="books")
public class Book implements Serializable {

	@Id
	@Column(name="id")
	private Integer bookId; // Wrapper classes should be preferred over primitives
	
	@Column(name="title",length=100)
	private String title;
	
	@Column(name="author",length=50)
	private String author;
	
	@Column(name="price",precision=6,scale=2) //Total digits=6, digits after DOT=2
	private Float price; //Prefer Wrapper classes

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(Integer bookId, String title, String author, Float price) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
}
