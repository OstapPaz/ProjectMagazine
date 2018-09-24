package com.defence.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.defence.dto.UserDto;
import com.defence.repository.UserRepository;

@Component
public class CheckIfEmailExistsValidator implements ConstraintValidator<CheckIfEmailExists, UserDto> {

	@Autowired private UserRepository ur;
	
	@Override
	public boolean isValid(UserDto userDto, ConstraintValidatorContext context) {
		
		if(ur.findUserByEmail(userDto.getEmail().toLowerCase()) == null) {
			return true;
		}
		
		return false;
	}

}
