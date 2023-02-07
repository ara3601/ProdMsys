package com.wipro.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.wipro.demo.model.Product;

public interface ProductRepository extends CrudRepository<Product, Integer>{

}
