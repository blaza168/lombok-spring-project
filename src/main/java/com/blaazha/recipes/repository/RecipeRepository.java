package com.blaazha.recipes.repository;

import com.blaazha.recipes.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
