package com.cg.manytomany.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity @Table(name="product_master")
public class Product implements Serializable {

	@Id private Integer id;
	private String name;
	private Double price;
	
	@ManyToMany(mappedBy="products")
	private Set<Order> orders;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Set<Order> getOrders() {
		return orders;
	}

	public void setOrders(Set<Order> orders) {
		this.orders = orders;
	}
	
	
}
