package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.Product;

import com.app.service.ProductService;
import com.app.service.ProductServiceImpl;

import io.swagger.v3.oas.annotations.parameters.RequestBody;


@RestController
@RequestMapping("/test")
public class Testcontroller {
	

	@Autowired
	ProductService ps;
	
	public Testcontroller()
	{
		System.out.println("in ctor of "+ getClass());
	}
	
	@PostMapping
	Product saveProduct(Product p)
	{
		return ps.saveProduct(p);
	}
	
	
	@GetMapping
	List<Product> getAllProducts()
	{
		return ps.getAll();
		
	}
	
	@DeleteMapping("/delete/{id}")
	String deleteById(int id)
	{
		return ps.deleteById(id);
	}
	
	@PutMapping
	Product update(Product newProduct)
	{
		return ps.update(newProduct);
	}

	
	
}
