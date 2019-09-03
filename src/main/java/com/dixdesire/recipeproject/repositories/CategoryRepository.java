package com.dixdesire.recipeproject.repositories;

import com.dixdesire.recipeproject.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
