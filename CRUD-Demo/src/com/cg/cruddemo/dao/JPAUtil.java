package com.cg.cruddemo.dao;

import javax.persistence.*;

// Singleton Class for acquiring entity manager
// Avoid creating more than ONE instance of EntityManager at all times
public class JPAUtil {
	private static EntityManager em;
	private static EntityManagerFactory factory;
	
	//Static Block : Invoked only ONCE!!
	static {
		factory = Persistence.createEntityManagerFactory("pu1");
	}
	
	public static EntityManager getEntityManager() {
		if(em == null || !em.isOpen()) {
			em = factory.createEntityManager();
		}
		return em;
	}
}
