package com.defence.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.defence.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>, JpaSpecificationExecutor<Product> {

	@Query("SELECT p FROM Product p WHERE p.name = :name")
	Product findProductByName(@Param("name") String name);
	
	@Query("SELECT p FROM Product p WHERE p.type = :type")
	List<Product> findByType(@Param("type") String type);
}
