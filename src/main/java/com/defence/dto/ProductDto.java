package com.defence.dto;

import lombok.Data;

@Data
public class ProductDto {

	private Integer id;
	
	private String name;

	private String type;
	
	private String description;
	
	private String maker;
	
	private String color;
	
	private String country;
	
	private String garanties;
	
	private long price;
	
}
