package ua.petstore.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.petstore.dao.CategoryDAO;
import ua.petstore.model.Category;


@RestController
@CrossOrigin("http://localhost:8080/")
@RequestMapping(value = "/category")
public class CategoryController {
	
	@Autowired
	private CategoryDAO categoryManager;
	
	@GetMapping
	public List<Category> getProducts() {
		return categoryManager.getAllCategory();
	}
	
}
