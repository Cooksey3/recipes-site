package org.cookseys.recipessite.classes;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Ingredient {

	@Id
	@GeneratedValue
	private long id;
	
	private String ingredient;
	private Double quantity;
	private String type;

	@ManyToMany(mappedBy = "ingredients")
	private Collection<Recipe> recipes;
	
	public Collection<Recipe> getRecipes() {
		return recipes;
	}
	
	public Ingredient(String ingredient, String type, double quantity) {
		this.ingredient = ingredient;
		this.quantity = quantity;
		this.type = type;
	}

	public String getIngredientName() {
		return ingredient;
	}

	public Double getQuantity() {
		return quantity;
	}

	public String getType() {
		return type;
	}

}
