package org.cookseys.recipessite.controllerTest;

import javax.annotation.Resource;

import org.cookseys.recipessite.classTest.RecipeRepository;
import org.cookseys.recipessite.classes.Recipe;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecipeRestController {

	@Resource
	private RecipeRepository recipeRepo;

	@RequestMapping("/recipes-object")
	public Iterable<Recipe> findRecipes() {
		return recipeRepo.findAll();
	}

}
