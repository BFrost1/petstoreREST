package ua.petstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.petstore.dao.CategoryDAO;
import ua.petstore.model.Category;
import ua.petstore.repository.CategoryRepositoty;

@Service
public class CategoryManager implements CategoryDAO {

	@Autowired
	private CategoryRepositoty repository;

	public CategoryManager() {
	}

	@Autowired
	public List<Category> getAllCategory() {
		return repository.findAll();
	}

}
