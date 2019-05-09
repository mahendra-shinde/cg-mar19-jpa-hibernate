package com.cg.manytoone.entities;

import java.io.Serializable;
import javax.persistence.*;

@Entity @Table(name="emps")
public class Employee implements Serializable{

	@Id private Integer id;
	private String name;
	
	@ManyToOne
	@JoinColumn(name="dept_no")
	private Department department;

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
}
