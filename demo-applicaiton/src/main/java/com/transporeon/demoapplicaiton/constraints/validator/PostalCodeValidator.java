package com.transporeon.demoapplicaiton.constraints.validator;

import com.transporeon.demoapplicaiton.constraints.PostalCode;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PostalCodeValidator implements ConstraintValidator<PostalCode, String> {

    @Override
    public boolean isValid(String postalCode, ConstraintValidatorContext constraintValidatorContext) {

        // REGEX
        final Pattern postalCodePattern = Pattern.compile("^\\d{2}-\\d{3}$");
        final Matcher matcher = postalCodePattern.matcher(postalCode);

        if (matcher.find()) {
            return true;
        }
        return false;
    }
}
