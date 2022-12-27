package ua.petstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.petstore.dao.ProductDAO;
import ua.petstore.model.Product;
import ua.petstore.repository.ProductRepositoty;

@Service
public class ProductManager implements ProductDAO {
	
	@Autowired
	private ProductRepositoty repository;

	public ProductManager() {
	}

	@Override
	public List<Product> getAllProduct() {
		return repository.findAll();
	}

	@Override
	public List<Product> getAllProductCategory(int category) {
		return repository.findByCategoryId(category);
	}

	@Override
	public Product getProductById(int id) {
		return repository.findById(id).get();
	}
}
