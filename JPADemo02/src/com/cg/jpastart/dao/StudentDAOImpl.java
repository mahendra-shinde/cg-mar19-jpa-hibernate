package com.cg.jpastart.dao;

import javax.persistence.EntityManager;

import com.cg.jpastart.entities.Student;

public class StudentDAOImpl implements StudentDAO {

	private EntityManager em = JPAUtil.getEntityManager();
	
	@Override
	public void save(Student student) {
		//TODO: Handle Exceptions
		em.getTransaction().begin();
		em.persist(student);
		em.getTransaction().commit();
		System.out.println("Record saved!");
	}

	@Override
	public Student findById(Integer studentId) {
		// TODO Auto-generated method stub
		//TODO: Handle Exceptions
		return em.find(Student.class, studentId);
	}

	@Override
	public void update(Student student) {
		//TODO: Handle Exceptions
		em.getTransaction().begin();
		em.merge(student);
		em.getTransaction().commit();
		System.out.println("Record Updated!");
	}

	@Override
	public void delete(Integer studentId) {
		//TODO: Handle Exceptions
		Student st = findById(studentId);
		em.getTransaction().begin();
		em.remove(st);
		em.getTransaction().commit();
		System.out.println("Record Removed");
		
	}

}
