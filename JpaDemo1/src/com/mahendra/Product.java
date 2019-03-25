package com.mahendra;

import javax.persistence.*;

@Entity
@Table(name="products")
public class Product {
	@Id
	@Column(name="id")
	private Integer productId;
	
	@Column(name="pname",length=20)
	private String name;
	
	private float price;

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}
