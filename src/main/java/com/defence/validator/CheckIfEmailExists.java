package com.defence.validator;

import static java.lang.annotation.ElementType.TYPE;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Retention(RetentionPolicy.RUNTIME)
@Target(TYPE)
@Constraint(validatedBy = CheckIfEmailExistsValidator.class)
public @interface CheckIfEmailExists {
	
	String message() default "Email already exist";
	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default {};

}
