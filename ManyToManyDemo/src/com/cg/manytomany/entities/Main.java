package com.cg.manytomany.entities;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory fact = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = fact.createEntityManager();
		
		Order order1 = new Order();
		order1.setOrderDate(new Date());
		order1.setId(101);
		
		Product prod1 = new Product();
		prod1.setId(2001);
		prod1.setName("Xyz");
		prod1.setPrice(1200D);
		
		Product prod2 = new Product();
		prod2.setId(2002);
		prod2.setName("Pqr");
		prod2.setPrice(1244.1D);
		
		Set<Order> orders = new HashSet<>();
		Set<Product> products = new HashSet<>();
		
		orders.add(order1);
		products.add(prod1);
		products.add(prod2);
		
		prod1.setOrders(orders);
		prod2.setOrders(orders);
		
		order1.setProducts(products);
		
		EntityTransaction tn = em.getTransaction();
		
		tn.begin();
		em.persist(prod1);
		em.persist(prod2);
		em.persist(order1);
		tn.commit();
		em.close();
		fact.close();
		
	}

}
