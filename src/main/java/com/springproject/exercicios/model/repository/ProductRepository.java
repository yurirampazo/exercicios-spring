package com.springproject.exercicios.model.repository;

import com.springproject.exercicios.model.entities.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface ProductRepository extends PagingAndSortingRepository<Product,Integer> {

  Iterable<Product> findProductByNameContainingIgnoreCase(String name);

  Iterable<Product> findProductByPriceContaining(double price);

  @Query("SELECT p FROM Produto p WHERE p.nome LIKE %:nome%")
  Iterable<Product> searchByNameLike(@Param("nome") String nome);

}
