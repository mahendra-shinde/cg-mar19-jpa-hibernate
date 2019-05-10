package com.cg.inheritance.entities;

import javax.persistence.*;

@Entity
@DiscriminatorValue("LIFE")
public class LifeInsurance extends InsurancePolicy {

	@Column(length=30)
	private String insuredPersonName;
	
	private Integer insuredPersonAge;

	public String getInsuredPersonName() {
		return insuredPersonName;
	}

	public void setInsuredPersonName(String insuredPersonName) {
		this.insuredPersonName = insuredPersonName;
	}

	public Integer getInsuredPersonAge() {
		return insuredPersonAge;
	}

	public void setInsuredPersonAge(Integer insuredPersonAge) {
		this.insuredPersonAge = insuredPersonAge;
	}
	
}
