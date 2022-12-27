package ua.petstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.petstore.model.Category;

public interface CategoryRepositoty extends JpaRepository<Category, Integer> {

}
