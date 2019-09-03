package com.dixdesire.recipeproject.repositories;

import com.dixdesire.recipeproject.model.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
