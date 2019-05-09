package com.cg.manytomany.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity @Table(name="order_master")
public class Order implements Serializable {

	@Id private Integer id;
	
	@Column(name="order_date")
	@Temporal(TemporalType.DATE)
	private Date orderDate;
	
	//Map JOIN-TABLE (JoinTable is Table used for Cross referencing,
	// No Seperate ENTITY is created for it!)
	// JoinColumns : Common Columns between Current Table "order_master" and
	// 				 Join Table "product_orders"
	// inverseJoinColumns: Common Columns between Target table "products" and
	//				 Join Table "product_orders"
	@ManyToMany
	@JoinTable(name="product_orders",
		joinColumns= {@JoinColumn(name="order_id")},
		inverseJoinColumns= {@JoinColumn(name="product_id") })
	private Set<Product> products;


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Date getOrderDate() {
		return orderDate;
	}


	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}


	public Set<Product> getProducts() {
		return products;
	}


	public void setProducts(Set<Product> products) {
		this.products = products;
	}
}
