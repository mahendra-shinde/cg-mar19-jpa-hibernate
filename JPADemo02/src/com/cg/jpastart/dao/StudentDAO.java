package com.cg.jpastart.dao;

import com.cg.jpastart.entities.Student;

public interface StudentDAO {
	//CREATE method
	void save(Student student); 
	//RETRIEVE
	Student findById(Integer studentId);
	
	//UPDATE
	void update(Student student);
	
	//DELETE
	void delete(Integer studentId);
	
}
