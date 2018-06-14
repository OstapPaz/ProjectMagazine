package com.defence.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Appointment extends BaseEntity {

	private String date;
	
	private Integer numOfProducts;
	
	@OneToOne
	@JoinColumn(name = "product_id", nullable = false)
	private Product product;
	
	@OneToOne
	@JoinColumn(name = "user_id", nullable = false)
	private User user;
	
}
