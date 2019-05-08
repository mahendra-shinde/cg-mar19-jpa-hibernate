package com.cg.onetoone.app;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.*;

import com.cg.onetoone.entities.Employee;
import com.cg.onetoone.entities.EmployeeDetail;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory fact = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = fact.createEntityManager();
		
		Employee emp = new Employee();
		emp.setEmpId("E101");
		emp.setSalary(23000D);
		emp.setDesignation("Developer");
		
		EmployeeDetail det = new EmployeeDetail();
		det.setEmpId("E101");
		det.setDateOfBirth(Date.valueOf(LocalDate.of(1999,3, 15)));
		det.setEmail("peter.parker@marvel.com");
		det.setFirstName("Peter");
		det.setLastName("Parker");
		
		emp.setDetails(det);
		
		em.getTransaction().begin();
		em.persist(det);
		em.persist(emp);
		em.getTransaction().commit();
		System.out.println("Record Saved!");
		em.close();
//		fact.close();
		
	}

}
