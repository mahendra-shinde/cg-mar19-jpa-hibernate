package com.cg.manytoone.entities;

import java.io.Serializable;
import javax.persistence.*;

@Entity @Table(name="depts")
public class Department implements Serializable {

	@Id private Integer id;
	
	private String name;

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
	
	
}
