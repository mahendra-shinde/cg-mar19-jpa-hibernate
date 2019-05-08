package com.cg.onetoone.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity @Table(name="emps")
public class Employee implements Serializable {

	@Id @Column(name="empid") 
	private String empId;
	
	@Column(name="desg",length=30)
	private String designation;
	
	@Column(name="sal",precision=10,scale=2)
	private Double salary;

	@OneToOne @JoinColumn(name="empid") 
	private EmployeeDetail details;

	public EmployeeDetail getDetails() {
		return details;
	}

	public void setDetails(EmployeeDetail details) {
		this.details = details;
	}

	
	public Employee() {
		super();
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	
}
