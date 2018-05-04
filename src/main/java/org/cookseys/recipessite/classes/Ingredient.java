package org.cookseys.recipessite.classes;

public class Ingredient {

	private String ingredient;
	private Double quantity;
	private String type;

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
