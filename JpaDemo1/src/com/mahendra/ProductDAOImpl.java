package com.mahendra;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class ProductDAOImpl implements ProductDAO {

	private EntityManager em;
	
	public ProductDAOImpl(EntityManager em){
		this.em = em;
	}
	
	@Override
	public void save(Product p) {
		EntityTransaction tn = null;
		try {
			tn = em.getTransaction();
			tn.begin();
			em.persist(p);
			tn.commit();
		}catch(Exception ex) {
			System.out.println("Error occurred! ");
			ex.printStackTrace();
			if(tn!=null) {
				System.out.println("Rolling back!");
				tn.rollback();
			}
		}
	}
	

	@Override
	public Product findById(Integer id) {
		return em.find(Product.class, id);
	}

	@Override
	public List<Product> listAll() {
		// TODO Auto-generated method stub
		return em.createQuery("select p from Product p").getResultList();
	}

	@Override
	public void update(Product p) {

		EntityTransaction tn = null;
		try {
			tn = em.getTransaction();
			tn.begin();
			em.merge(p);
			tn.commit();
		}catch(Exception ex) {
			System.out.println("Error occurred! ");
			ex.printStackTrace();
			if(tn!=null) {
				System.out.println("Rolling back!");
				tn.rollback();
			}
		}
	}

}
