package ua.petstore.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ua.petstore.dao.ProductDAO;
import ua.petstore.model.Product;

@RestController
@CrossOrigin("http://localhost:8080/")
@RequestMapping(value = "/product")
public class ProductController {
	
	@Autowired
	private ProductDAO productManager;
	
	@GetMapping
	public Product getProductId(@RequestParam int id) {
		return productManager.getProductById(id);
	}
	
	
	@GetMapping (value = "/all")
	public List<Product> getProducts() {
		return productManager.getAllProduct();
	}
	
	@GetMapping (value = "/category")
	public List<Product> getAllProductCategory(@RequestParam int id) {
		return productManager.getAllProductCategory(id);
	}
	

}
