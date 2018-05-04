package org.cookseys.recipessite.classTest;

import static java.util.Arrays.asList;

import java.util.Collection;
import java.util.HashSet;

public class Recipe {

	private String chefName;
	private String ingredient;
	private Collection<String> ingredients;

	public Recipe(String chefName) {
		this.chefName = chefName;
	}

	public Recipe(String chefName, String ingredient) {
		this.chefName = chefName;
		this.ingredient = ingredient;
	}

	public Recipe(String chefName, String...ingredients) {
		this.chefName = chefName;
		this.ingredients = new HashSet<>(asList(ingredients));
	}

	public String getName() {
		return chefName;
	}

	public String getIngredient() {
		return ingredient;
	}

	public Collection<String> getIngredients() {
		return ingredients;
	}

}
