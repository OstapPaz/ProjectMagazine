package com.defence.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.defence.entity.enums.UserRole;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User extends BaseEntity {

	private String login;
	
	private String firstName;
	
	private String phoneNumber;
	
	private String email;
	
	private String password;
	
	@Enumerated(EnumType.STRING)
	private UserRole role;
	
}
