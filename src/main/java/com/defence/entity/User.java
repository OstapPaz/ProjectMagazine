package com.defence.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;

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
	
	@OneToMany(mappedBy = "user")
	private List<Appointment> appointments;
	
	@OneToMany(mappedBy = "user")
	private List<Comments> comments;
}
