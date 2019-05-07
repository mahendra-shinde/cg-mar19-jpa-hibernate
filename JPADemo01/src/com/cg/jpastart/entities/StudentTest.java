package com.cg.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class StudentTest {

	public static void main(String[] args) {
		//Configure the JPA
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		//Create a Connection to DATABASE
		EntityManager em = factory.createEntityManager();
		// Student DOESNOT EXISTS ! [Stage 0]
		em.getTransaction().begin();
		// NEW STUDENT [Stage 1]
		Student student = new Student();
		
		student.setStudentId(103);
		student.setName("Tom");
		
		// MANAGED [Stage 2]
		em.persist(student);
		
		//Any change in object WHEN IT'S in MANAGED state
		//Results in UPDATE query fired by JPA
		// CONDITION : Must be invoked BEFORE "commit"
		student.setName("Gopal");
		em.getTransaction().commit();
		
		System.out.println("Added one student to database.");
		em.close(); //Close the Connection
		// DETACHED 
		student.setName("Mahesh");
		factory.close(); //Close the JPA Configuration
		// DOES NOT EXISTS! [ GC consumes Object "student" ]
		// NOT REMOVED FROM DATABASE
	}
}
