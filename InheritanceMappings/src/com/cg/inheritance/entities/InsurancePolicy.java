package com.cg.inheritance.entities;

import javax.persistence.*;
import java.util.Date;
import java.io.Serializable;

@Entity
@Table(name="policy")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="POLICY_TYPE")
public class InsurancePolicy implements Serializable {

	@Id
	private Integer policyId;
	
	@Temporal(TemporalType.DATE)
	private Date dateOfIssue;
	
	private Double sumAssurred;

	public Integer getPolicyId() {
		return policyId;
	}

	public void setPolicyId(Integer policyId) {
		this.policyId = policyId;
	}

	public Date getDateOfIssue() {
		return dateOfIssue;
	}

	public void setDateOfIssue(Date dateOfIssue) {
		this.dateOfIssue = dateOfIssue;
	}

	public Double getSumAssurred() {
		return sumAssurred;
	}

	public void setSumAssurred(Double sumAssurred) {
		this.sumAssurred = sumAssurred;
	}
	
}
