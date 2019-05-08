package com.cg.onetoone.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity @Table(name="emp_details")
public class EmployeeDetail implements Serializable {

	@Id @Column(name="empid") 
	private String empId;
	
	@Column(name="fname",length=30)
	private String firstName;
	
	@Column(name="lname",length=30)
	private String lastName;
	
	@Column(name="email",length=80)
	private String email;
	
	@Column(name="dob")
	@Temporal(TemporalType.DATE) //Store ONLY DATE and NOT TIME!
	private Date dateOfBirth;

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
}
