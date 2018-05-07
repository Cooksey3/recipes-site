package org.cookseys.recipessite.classTest;

import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.cookseys.recipessite.classes.Ingredient;
import org.cookseys.recipessite.classes.Recipe;
import org.junit.Test;
import static org.hamcrest.Matchers.contains;
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
		
		Collection<Ingredient> ingredient = underTest.getIngredients();
		
		assertThat(ingredient, contains(apples));
	}
	
	@Test
	public void recipeShouldHaveDifferentIngredient() {
		Ingredient ingredient2 = new Ingredient("Blueberries", "", 0.0);
		Recipe underTest = new Recipe("George", ingredient2);
		
		Collection<Ingredient> ingredients = underTest.getIngredients();
		
		assertThat(ingredients, contains(ingredient2));
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
		
		Collection<Ingredient> fruit = underTest.getIngredients();
		
		assertThat(fruit, contains(apples));
	}
		
}