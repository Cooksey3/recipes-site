package org.cookseys.recipessite.classTest;

import static org.junit.Assert.assertThat;

import org.cookseys.recipessite.classes.Ingredient;

import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class IngredientTest {

	@Test
	public void ingredientShouldHaveName() {
		Ingredient underTest = new Ingredient("Onions", "", 0.0);

		String ingredient = underTest.getIngredientName();

		assertThat(ingredient, is("Onions"));
	}

	@Test
	public void ingredientShouldHaveDifferentName() {
		Ingredient underTest = new Ingredient("Blueberries", "", 0.0);

		String ingredient = underTest.getIngredientName();

		assertThat(ingredient, is("Blueberries"));
	}

	@Test
	public void ingredientShouldHaveQuantity() {
		Ingredient underTest = new Ingredient("Onions", "", 4.0);

		Double quantity = underTest.getQuantity();

		assertThat(quantity, is(4.0));
	}

	@Test
	public void ingredientShouldHaveDifferentQuantity() {
		Ingredient underTest = new Ingredient("Onions", "Vegetable", 5.0);

		Double quantity = underTest.getQuantity();

		assertThat(quantity, is(5.0));
	}
	
	@Test
	public void ingredientShouldHaveType() {
		Ingredient underTest = new Ingredient("Onions", "Vegetable", 5.0);
		
		String type = underTest.getType();
		
		assertThat(type, is("Vegetable"));
	}

	@Test
	public void ingredientShouldHaveDifferentType() {
		Ingredient underTest = new Ingredient("Blueberries", "Fruit", 5.0);
		
		String type = underTest.getType();
		
		assertThat(type, is("Fruit"));
	}
	
}
