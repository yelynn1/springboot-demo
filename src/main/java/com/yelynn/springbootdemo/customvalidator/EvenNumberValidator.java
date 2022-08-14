package com.yelynn.springbootdemo.customvalidator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EvenNumberValidator implements ConstraintValidator<EvenNumber, Integer> {

  @Override
  public boolean isValid(Integer value, ConstraintValidatorContext context) {
    return value % 2 == 0;
  }
}
