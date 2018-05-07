package org.cookseys.recipessite.classes;

import static java.util.Arrays.asList;

import java.util.Collection;
import java.util.HashSet;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Recipe {

	@Id
	private long id;
	
	private String chefName;

	public Recipe(String chefName) {
		this.chefName = chefName;
	}

	public Recipe(String chefName, Ingredient...ingredients) {
		this.chefName = chefName;
		this.ingredients = new HashSet<>(asList(ingredients));
	}

	public String getName() {
		return chefName;
	}

	@JsonIgnore
	@ManyToMany
	private Collection<Ingredient> ingredients;

	public Collection<Ingredient> getIngredients() {
		return ingredients;
	}


}
