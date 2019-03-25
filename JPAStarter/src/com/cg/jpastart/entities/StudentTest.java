package com.cg.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class StudentTest {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		//Start of Persistence Context
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();	// DOESN'T Exists
		Student student = new Student(); // (NEW) Entity exists but record in database DO NOT exists!
		student.setName("Janardan");
		student.setStudentId(104);
		em.persist(student);	// (Managed) Entity is Linked with DB Record!
		student.setName("Danny"); //Fires an Update Query!
		em.getTransaction().commit(); //End of Transaction -> Entity in "Detached" mode
		student.setName("Boby"); //No effect on Database
		System.out.println("Added one student to database.");
		em.close(); 
		
		factory.close();
	}
}
