package com.defence.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.defence.entity.Product;
import com.defence.filter.ProductFilter;

public interface ProductService {
	
	public void saveProduct(Product product);
	
	Product findProductById(Integer id);
	
	List<Product> findAll();
		
	Product findProductByName(String name);
	
	List<Product> findByType(String type);
	
	public Page<Product> getProductByFilter(ProductFilter filter, Pageable pageable);
}
