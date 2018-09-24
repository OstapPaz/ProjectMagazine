package com.defence.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product extends BaseEntity {

	private String name;

	private String type;
	
	private String description;
	
	private String maker;
	
	private String color;
	
	private String country;
	
	private String garanties;
	
	private long price;
	
	@OneToMany(mappedBy = "product")
	private List<Comments> comments;
	
}
