package com.cg.manytoone.app;

import java.util.List;

import javax.persistence.*;

import com.cg.manytoone.entities.Employee;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory fact = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = fact.createEntityManager();
		
		//JPQL Query to search ALL employees working in department# 202
		TypedQuery<Employee> q = em.createQuery(
					"select e from Employee e where e.department.id= :id"
					,Employee.class);
		q.setParameter("id", 202); 
		List<Employee> emps = q.getResultList();
		
		System.out.println("Found records : "+emps.size());
		for(Employee e: emps) {
			System.out.println(e.getId()+" "+e.getName());
		}
	
		em.close();
		fact.close();
	}

}
