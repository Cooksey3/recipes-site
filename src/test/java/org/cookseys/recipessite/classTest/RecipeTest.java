package org.cookseys.recipessite.classTest;

import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.cookseys.recipessite.classes.Ingredient;
import org.cookseys.recipessite.classes.Recipe;
import org.junit.Test;

public class RecipeTest {
	
	private Ingredient apples = new Ingredient("Apples", "Fruit", 4.0);
	
	@Test
	public void shouldRetrieveChefName() {
		Recipe underTest = new Recipe("George");
		
		String name = underTest.getName();
		
		assertThat(name, is("George"));
	}
	
	@Test
	public void recipeShouldHaveOneIngredient() {
		Recipe underTest = new Recipe("George", apples);
		
		Ingredient ingredient = underTest.getIngredient();
		
		assertThat(ingredient, is(apples));
	}
	
	@Test
	public void recipeShouldHaveDifferentIngredient() {
		Ingredient ingredient2 = new Ingredient("Blueberries", "", 0.0);
		Recipe underTest = new Recipe("George", ingredient2);
		
		 Ingredient blueberries = underTest.getIngredient();
		
		assertThat(ingredient2, is(blueberries));
	}
	
	@Test
	public void recipeShouldHaveMultipleIngredients() {
		Ingredient ingredient2 = new Ingredient("Blueberries", "", 0.0);
		Recipe underTest = new Recipe("George", apples, ingredient2);
		
		assertThat(underTest.getIngredients(), containsInAnyOrder(apples, ingredient2));
	}
	
	@Test
	public void recipeShouldContainIngredient() {
		Recipe underTest = new Recipe("George", apples);
		
		Ingredient fruit = underTest.getIngredient();
		
		assertThat(fruit, is(apples));
	}
}