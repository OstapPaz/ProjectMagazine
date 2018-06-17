package com.defence.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.ui.ModelMap;

import com.defence.dto.UserDto;
import com.defence.entity.enums.UserRole;

public class UserMapper {

	public static User toSecurityUser(com.defence.entity.User user) {
		return new User(user.getLogin(), user.getPassword(),
				AuthorityUtils.createAuthorityList(String.valueOf(user.getRole())));
	}
	
	public static com.defence.entity.User toOurUser(UserDto userDto) {
		new com.defence.entity.User();
		return com.defence.entity.User.builder()
				.login(userDto.getLogin()).email(userDto.getEmail())
				.firstName(userDto.getFirstName()).phoneNumber(userDto.getPhoneNumber())
				.password(userDto.getPassword()).role(UserRole.ROLE_USER).build();
	}
	
	public static com.defence.entity.User toOurUserSetRole(UserDto userDto) {
		return new ModelMapper().map(userDto, com.defence.entity.User.class);
	}
	
	public static UserDto toDtoUser(com.defence.entity.User user) {
		return new ModelMapper().map(user, UserDto.class);
	}
	

	
	
}
