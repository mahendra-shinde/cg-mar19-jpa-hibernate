package com.cg.manytoone.app;
import javax.persistence.*;

import com.cg.manytoone.entities.Department;
import com.cg.manytoone.entities.Employee;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory fact = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = fact.createEntityManager();
		
		Department dept = new Department();
		dept.setId(202);
		dept.setName("Avengers");
		
		Employee emp = new Employee();
		emp.setId(101);
		emp.setName("Steve Rogers");
		emp.setDepartment(dept);
		
		Employee emp2 = new Employee();
		emp2.setId(102);
		emp2.setName("Tony Stark");
		emp2.setDepartment(dept);
		
		Employee emp3 = new Employee();
		emp3.setId(103);
		emp3.setName("Bruce Banner");
		emp3.setDepartment(dept);
		
		EntityTransaction tn = em.getTransaction();
		tn.begin();
		em.persist(dept);
		em.persist(emp);
		em.persist(emp2);
		em.persist(emp3);
		tn.commit();
		
		em.close();
		fact.close();
		
		
		
	}

}
