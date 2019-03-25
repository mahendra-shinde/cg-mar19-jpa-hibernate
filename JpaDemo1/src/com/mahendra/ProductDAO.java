package com.mahendra;

import java.util.List;

public interface ProductDAO {

	void save(Product p);
	Product findById(Integer id);
	List<Product> listAll();
	void update(Product p);
}
