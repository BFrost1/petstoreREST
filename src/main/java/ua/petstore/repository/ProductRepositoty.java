package ua.petstore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.petstore.model.Product;

public interface ProductRepositoty extends JpaRepository<Product, Integer> {
	List<Product> findByCategoryId(int id);
}
