package com.mahendra;

import javax.persistence.*;

import oracle.net.aso.e;


/**
 * Testing Persistence Unit
 * @author mahendra
 *
 */
public class TestPU {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		
		System.out.println("Trying Insert operations");
		testInsert(em);
		System.out.println("Searching product by name!");
		
		System.out.println("Delete operation: ");
		testSearch(em);
		
		
		em.close();
	}
	static void testInsert(EntityManager em) {
		Product p1 = new Product();
		p1.setPrice(50);
		p1.setName("Lifebouy Classic");
		p1.setProductId(101);
		
		Product p2 = new Product();
		p2.setPrice(600);
		p2.setName("Dove");
		p2.setProductId(102);
		
		EntityTransaction tn = null;
		try {
			tn = em.getTransaction();
			tn.begin();
			em.persist(p1);
			em.persist(p2);
			tn.commit();
		}catch(Exception ex) {
			System.out.println("Error occurred! ");
			ex.printStackTrace();
			if(tn!=null) {
				System.out.println("Rolling back!");
				tn.rollback();
			}
		}
	}
	static void testSearch(EntityManager em) {
		//No Transaction required for SELECT queries
		System.out.println("Searching for 'dove' ");
		//Using JPA QL (Query Language)
		Query q = em.createQuery("select p from Product p where p.name = 'Dove'");
		Product p = (Product) q.getResultList().get(0);
		System.out.println("Found "+p.getName()+", it's price is "+p.getPrice());
	}
	static void testDelete(EntityManager em)
	{
		System.out.println("Deleting product 102");
		EntityTransaction tn = em.getTransaction();
		try {
			tn.begin();
			Product temp = em.find(Product.class, 102);
			em.remove(temp);
			tn.commit();
		}catch(Exception ex) {
			ex.printStackTrace();
			if(tn!=null)
				tn.rollback();	
		}
	}
}
