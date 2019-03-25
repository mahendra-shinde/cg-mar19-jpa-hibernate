package com.mahendra;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestDAO {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		
		ProductDAO dao = new ProductDAOImpl(em);
		
		System.out.println("Insert record");
		Product p1 = new Product();
		p1.setPrice(50);
		p1.setName("Lifebouy Classic");
		p1.setProductId(101);
		
		Product p2 = new Product();
		p2.setPrice(600);
		p2.setName("Dove");
		p2.setProductId(102);
		
		dao.save(p1);
		dao.save(p2);
		
		System.out.println("Getting all records");
		List<Product> products = dao.listAll();
		for(Product p:products) {
			System.out.println(p.getName()+" "+p.getPrice());
		}
	}

}
