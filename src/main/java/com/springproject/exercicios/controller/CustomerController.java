package com.springproject.exercicios.controller;

import com.springproject.exercicios.model.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerController {

  @GetMapping(path = "/yuri")
  public Customer obterCliente(){
    return new Customer(28,"Yuri", "159753825");
  }

  @GetMapping(path = "/{id}")
  public Customer getCustomerById(@PathVariable int id) {
    return new Customer(id, "Janaina", "159753824");
  }

  @GetMapping
  public Customer getCustomerById2(@RequestParam(name = "id", defaultValue = "1") int id) {
    return new Customer(id, "Katia", "159753826");
  }
}
