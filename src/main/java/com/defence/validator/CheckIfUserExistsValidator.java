package com.defence.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.defence.dto.UserDto;
import com.defence.repository.UserRepository;

@Component
public class CheckIfUserExistsValidator implements ConstraintValidator<CheckIfPasswordsEq, UserDto> {

	@Autowired private UserRepository ur;
	
	@Override
	public boolean isValid(UserDto userDto, ConstraintValidatorContext context) {
		
		if(ur.findUserByEmailOrLogin(userDto.getEmail().toLowerCase(),
				userDto.getLogin().toLowerCase()) == null) {
			return true;
		}
		
		return false;
	}

	
}
