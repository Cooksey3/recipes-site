package org.cookseys.recipessite.classTest;

import org.springframework.data.repository.CrudRepository;
import org.cookseys.recipessite.classes.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
