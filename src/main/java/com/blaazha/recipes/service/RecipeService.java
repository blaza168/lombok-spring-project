package com.blaazha.recipes.service;

import com.blaazha.recipes.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}
