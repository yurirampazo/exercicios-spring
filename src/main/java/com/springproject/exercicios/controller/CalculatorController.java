package com.springproject.exercicios.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
  //calculator/sum/10/20
  //calculator/subtraction?a=100&b=39

  @GetMapping(path = "/{a}/{b}")
  public String sum(@PathVariable int a, @PathVariable int b) {
    return "Result for " + a + " + " + b +" = "  + (a + b);
  }

  @GetMapping
  public String subtraction(@RequestParam(name = "a", defaultValue = "100") int a
        , @RequestParam(name = "b", defaultValue = "30") int b) {
    return "Result for " + a + " - " + b +" = "  + (a - b);
  }

}
