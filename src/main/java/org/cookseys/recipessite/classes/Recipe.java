package org.cookseys.recipessite.classes;

import static java.util.Arrays.asList;

import java.awt.List;
import java.util.Collection;
import java.util.HashSet;

public class Recipe {

	private String chefName;
	private Ingredient ingredient;
	private Collection<Ingredient> ingredients;

	public Recipe(String chefName) {
		this.chefName = chefName;
	}

//	public Recipe(String chefName, String ingredient) {
//		this.chefName = chefName;
//		this.ingredient = ingredient;
//	}

	public Recipe(String chefName, Ingredient...ingredients) {
		this.chefName = chefName;
		this.ingredients = new HashSet<>(asList(ingredients));
	}

	public Recipe(String chefName, Ingredient ingredient) {
		this.ingredient = ingredient;
	}

	public String getName() {
		return chefName;
	}

	public Ingredient getIngredient() {
		return ingredient;
	}

	public Collection<Ingredient> getIngredients() {
		return ingredients;
	}

}
