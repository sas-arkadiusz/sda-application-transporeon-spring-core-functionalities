package com.transporeon.demoapplicaiton.constraints;

import com.transporeon.demoapplicaiton.constraints.validator.PostalCodeValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = PostalCodeValidator.class)
@Documented
public @interface PostalCode {

    String message() default "Postal Code format is not valid!";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
