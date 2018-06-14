package com.defence.entity.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum UserRole {

	ROLE_USER("ADMIN"), ROLE_ADMIN("USER");
	
	private String role;
}
