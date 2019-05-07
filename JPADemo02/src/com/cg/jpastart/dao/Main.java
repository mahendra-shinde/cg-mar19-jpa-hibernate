package com.cg.jpastart.dao;

import com.cg.jpastart.entities.Student;

public class Main {

	public static void main(String[] args) {
		StudentDAO dao = new StudentDAOImpl();
		//Test CREATE
		System.out.println("Creating record");
		Student s1 = new Student();
		s1.setName("Max");
		s1.setStudentId(105);
		dao.save(s1);
		
		System.out.println("Updating record");
		s1.setName("Drax");
		dao.update(s1);
		
		System.out.println("Finding record");
		Student s2 = dao.findById(105);
		System.out.println("Found: "+s2.getName());

		System.out.println("Deleting a record");
		dao.delete(105);
		
		System.out.println("Find after delete (Beware of Exceptions!)");
		s2 = dao.findById(105);
		System.out.println("Found: "+s2.getName());

		
	}

}
