package com.yelynn.springbootdemo.customvalidator;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/custom-validator")
@Validated
public class Controller {
  @GetMapping("/even-number/{number}")
  public String checkEvenNumber(@PathVariable @EvenNumber(message = "Only even number is accepted") Integer number) {
    return String.format("Even number provided is: %d", number);
  }
}
