package com.springproject.exercicios.controller;

import com.springproject.exercicios.model.entities.Product;
import com.springproject.exercicios.model.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Optional;

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

  @GetMapping
  public Iterable<Product> getAll() {
    return repository.findAll();
  }

  @GetMapping("/{id}")
  public Optional<Product> getProductById(@PathVariable int id) {
    return repository.findById(id);
  }

  @GetMapping("/name/{name}")
  public Iterable<Product> getProductByName(@PathVariable String name) {
    return repository.findProductByNameContainingIgnoreCase(name);
  }

  @GetMapping("/page/{numberPage}")
  public Iterable<Product> getProductByPage(@PathVariable int numberPage) {

    Pageable page = PageRequest.of(numberPage, 3);
    return repository.findAll(page);
  }

  @PutMapping("/{id}")
  public Product updateProduct(@Valid @RequestBody Product product) {
    return repository.save(product);
  }

  @DeleteMapping("/{id}")
  public void deleteProductById(@PathVariable int id) {
    repository.deleteById(id);
  }

}
