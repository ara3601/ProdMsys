package com.wipro.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.demo.dao.ProductRepository;

import com.wipro.demo.model.Product;
@Service
public class ProductService {



	@Autowired
	private ProductRepository prodDAO;
	
	public Product ProductSave(Product pro)
	{
		Product prod =prodDAO.save(pro);
		return prod;
	}
	public Product findProductById(Integer productId)
	{
		Optional<Product> pro=prodDAO.findById(productId);
		if(pro.isPresent())
		{
			return pro.get();
		}
		else
		{
			return null;
		}
	}
	public List<Product> findAll()
	{
		return (List<Product>) prodDAO.findAll();
	}
	
	public Product ProductUpdate(Product prod)
	
	{
		Product pro =prodDAO.save(prod);
		return pro;
	}
	public String ProductRemove(Integer prodId) {
	
	
			prodDAO.deleteById(prodId);
			return "deleted";
		}
	

}


