package com.defence.service;

import java.util.List;

import com.defence.entity.Product;

public interface ProductService {
	
	public void saveProduct(Product product);
	
	Product findProductById(Integer id);
	
	List<Product> findAll();
	
	void update(Product product);
	
	Product findProductByName(String name);
}
