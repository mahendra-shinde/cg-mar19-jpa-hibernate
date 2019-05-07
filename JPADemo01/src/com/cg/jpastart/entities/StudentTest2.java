package com.cg.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class StudentTest2 {

	public static void main(String[] args) {
		//Configure the JPA
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		//Create a Connection to DATABASE
		EntityManager em = factory.createEntityManager();
	//	NO NEED OF TRANSACTION
		Student s = em.find(Student.class,101);
		System.out.println("Student name: "+s.getName());
		
		em.close(); //Close the Connection
		factory.close(); //Close the JPA Configuration
	}
}
