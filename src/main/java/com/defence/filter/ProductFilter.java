package com.defence.filter;

import lombok.Data;

@Data
public class ProductFilter {

	private String searchName;
	
	private String searchType;
	
	private String searchMaker;
	
	private String searchCountry;
	
	private String searchMinPrice;
	
	private String searchMaxPrice;
	
}
