package com.defence.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.defence.entity.Product;
import com.defence.filter.ProductFilter;
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
		return pr.findAll();
	}

	@Override
	public Product findProductByName(String name) {
		return pr.findProductByName(name);
	}

	@Override
	public List<Product> findByType(String type) {
		return pr.findByType(type);
	}

	@Override
	public Page<Product> getProductByFilter(ProductFilter filter, Pageable pageable) {
		return pr.findAll(getSpecification(filter), pageable);
	}

	public Specification<Product> getSpecification(ProductFilter filter) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	

	
	
}
