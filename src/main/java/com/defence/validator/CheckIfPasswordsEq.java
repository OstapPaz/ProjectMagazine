package com.defence.validator;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import static java.lang.annotation.ElementType.TYPE;
import javax.validation.Constraint;
import javax.validation.Payload;

@Retention(RetentionPolicy.RUNTIME)
@Target(TYPE)
@Constraint(validatedBy = CheckIfPasswordsEqValidator.class)
public @interface CheckIfPasswordsEq {
	
	String message() default "Passwords are not equivalents";
	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default {};

}
