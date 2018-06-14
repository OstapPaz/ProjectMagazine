package com.defence.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.defence.entity.Product;
import com.defence.repository.ProductRepository;
import com.defence.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired ProductRepository pr;

	@Override
	public void saveProduct(Product product) {
		pr.save(product);
	}

	@Override
	public Product findProductById(Integer id) {
		return pr.getOne(id);
	}

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Product findProductByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
