package com.cg.jpastart.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	private static EntityManager em;
	
	private static void build() {
		EntityManagerFactory fact = Persistence.createEntityManagerFactory("JPA-PU");
		em = fact.createEntityManager();
	}
	
	public static EntityManager getEntityManager() {
		if(em==null || !em.isOpen()) {
			build();
		}
		return em;
	}
	
}
