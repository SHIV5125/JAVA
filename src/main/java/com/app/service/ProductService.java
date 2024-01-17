package com.app.service;

import java.util.List;

import com.app.entities.Product;

public interface ProductService {
	
	Product getById(int id);
	
	List<Product>getAll();
	
	List<Product>getByName(String name);
	
	String deleteById(int id);
	
	Product update(Product newProduct);
	
	Product saveProduct(Product product);
	
	
	

}
