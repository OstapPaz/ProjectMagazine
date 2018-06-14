package com.defence.mapper;

import org.modelmapper.ModelMapper;
import com.defence.dto.ProductDto;
import com.defence.entity.Product;

public class ProductMapper {

	public static Product toProduct(ProductDto productDto) {
		return new ModelMapper().map(productDto, Product.class);
	}
	
}
