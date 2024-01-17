package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entities.Product;
import com.app.repository.ProductRepository;


@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository prodrepo;
	
	
	@Override
	public Product getById(int id) {
		return prodrepo.getById(id);
	}

	@Override
	public List<Product> getAll() {
		return prodrepo.findAll();
	}

	@Override
	public List<Product> getByName(String name) {
		return null;// prodrepo.findByProductname();
	}

	@Override
	public String deleteById(int id) {
	
		prodrepo.deleteById(id);
		return "product deleted successfully";
	}

	@Override
	public Product update(Product newProduct) {
		
		Product oldproduct=prodrepo.findById(newProduct.getId()).orElse(null);
		
		oldproduct.setProductname(newProduct.getProductname());
		oldproduct.setQuantity(newProduct.getQuantity());
		
		return prodrepo.save(oldproduct);
		
	}

	@Override
	public Product saveProduct(Product product) {
		
		return prodrepo.save(product);
	
		
	} 
	
	

}
