package com.defence.dto;

import com.defence.entity.enums.UserRole;
import com.defence.validator.CheckIfPasswordsEq;
import com.defence.validator.CheckIfUserExists;

import lombok.Data;

@Data
@CheckIfPasswordsEq
@CheckIfUserExists
public class UserDto {
	
	private Integer id;

	private String login;

	private String firstName;
	
	private String phoneNumber;
	
	private String email;

	private String password;
	
	private String passwordConfirm;
	
	private UserRole role;

}
