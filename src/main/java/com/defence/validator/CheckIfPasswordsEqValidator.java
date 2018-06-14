package com.defence.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.stereotype.Component;

import com.defence.dto.UserDto;

@Component
public class CheckIfPasswordsEqValidator implements ConstraintValidator<CheckIfPasswordsEq, UserDto> {

	@Override
	public boolean isValid(UserDto userDto, ConstraintValidatorContext context) {
		return userDto.getPassword().equals(userDto.getPasswordConfirm());
	}

	
	
}
