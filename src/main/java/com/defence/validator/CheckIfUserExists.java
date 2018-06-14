package com.defence.validator;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Retention(RUNTIME)
@Target(TYPE)
@Constraint(validatedBy = CheckIfUserExistsValidator.class)
public @interface CheckIfUserExists {

	String message() default "Login or email already exists";
	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default {};
	
}
