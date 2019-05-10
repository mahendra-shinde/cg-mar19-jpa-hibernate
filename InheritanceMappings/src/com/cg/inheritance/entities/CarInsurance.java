package com.cg.inheritance.entities;

import javax.persistence.*;

@Entity
@DiscriminatorValue("CAR")
public class CarInsurance extends InsurancePolicy {
	@Column(length=20)
	private String carModel;
	@Column(length=30)
	private String chassisNumber;
	
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public String getChassisNumber() {
		return chassisNumber;
	}
	public void setChassisNumber(String chassisNumber) {
		this.chassisNumber = chassisNumber;
	}
	
	
}
