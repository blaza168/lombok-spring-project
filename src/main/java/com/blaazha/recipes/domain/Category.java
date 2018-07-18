package com.blaazha.recipes.domain;

import javax.persistence.*;
import java.util.Set;

// look at section 9 Gotchat lection to solve an errors in lombok
@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // Do not generate setter
    private Long id;
    private String description;
    @ManyToMany(mappedBy = "categories")
    private Set<Recipe> recipes;

    public Category() {
    }

    public Long getId() {
        return this.id;
    }

    public String getDescription() {
        return this.description;
    }

    public Set<Recipe> getRecipes() {
        return this.recipes;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
