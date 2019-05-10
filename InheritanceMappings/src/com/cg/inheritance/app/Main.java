package com.cg.inheritance.app;

import javax.persistence.*;
import java.util.Date;
import com.cg.inheritance.entities.CarInsurance;
import com.cg.inheritance.entities.InsurancePolicy;
import com.cg.inheritance.entities.LifeInsurance;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory fact = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = fact.createEntityManager();
		
		LifeInsurance policy1 = new LifeInsurance();
		CarInsurance policy2 = new CarInsurance();
		
		policy1.setPolicyId(10023);
		policy1.setDateOfIssue(new Date());
		policy1.setSumAssurred(2300000D);
		policy1.setInsuredPersonName("Narendra");
		policy1.setInsuredPersonAge(64);
		
		
		policy2.setPolicyId(20045);
		policy2.setDateOfIssue(new Date());
		policy2.setSumAssurred(500000D);
		policy2.setCarModel("Mahindra TUV 500");
		policy2.setChassisNumber("562386923469811");
		
		EntityTransaction tn = em.getTransaction();
		tn.begin();
		em.persist(policy1);
		em.persist(policy2);
		tn.commit();
		System.out.println("Saved!");
		
		em.close();
		fact.close();
	}

}
