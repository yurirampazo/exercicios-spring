package com.springproject.exercicios.model.repository;

import com.springproject.exercicios.model.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product,Integer> {

}
