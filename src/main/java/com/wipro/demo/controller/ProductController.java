package com.wipro.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.demo.model.Product;
import com.wipro.demo.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	ProductService proService;
	
	@PostMapping("/product")
	public Product productSave(@RequestBody Product product) {
		return proService.ProductSave(product);
	}
	@GetMapping("products")
	public List<Product> AllProducts() {
		return proService.findAll();	
		}
	@GetMapping("product/{prodId}")
	public Product getProduct(@PathVariable int prodId) {
		return proService.findProductById(prodId);
	}
	@PutMapping("/modify-product/{prodId}")
		public Product UpdateProduct(@RequestBody Product product) {
		return proService.ProductUpdate(product);
	}
	@DeleteMapping("/remove-product/{prodId}")
	public String DeleteProduct(@PathVariable int prodId) {
		return proService.ProductRemove(prodId);
	}
}
