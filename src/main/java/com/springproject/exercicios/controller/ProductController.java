package com.springproject.exercicios.controller;

import com.springproject.exercicios.model.entities.Product;
import com.springproject.exercicios.model.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/products")
public class ProductController {

  @Autowired
  private ProductRepository repository;

  @PostMapping
  public @ResponseBody Product newProduct(@Valid @RequestBody Product product) {
    repository.save(product);
    return product;
  }
}
