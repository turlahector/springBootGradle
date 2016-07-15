package com.jayturla.repositories;

import org.springframework.data.repository.CrudRepository;

import com.jayturla.model.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {
	
}
