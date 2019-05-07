package com.cg.jpastart.entities;

import java.io.Serializable;

import javax.persistence.*;

@Entity // A Mapped Entity (Class Mapped to Table)
@Table(name="students") // Which table to MAP ?
public class Student implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id //Resolve Impedance Mismatch (IDENTITY)
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private int studentId;
	private String name;
	
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}