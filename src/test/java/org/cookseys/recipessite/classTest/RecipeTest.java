package org.cookseys.recipessite.classTest;

import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class RecipeTest {
	
	@Test
	public void shouldRetrieveChefName() {
		Recipe underTest = new Recipe("George");
		
		String name = underTest.getName();
		
		assertThat(name, is("George"));
	}
	
	@Test
	public void recipeShouldHaveOneIngredient() {
		Recipe underTest = new Recipe("George", "Onions");
		
		String ingredient = underTest.getIngredient();
		
		assertThat(ingredient, is("Onions"));
	}
	
	@Test
	public void recipeShouldHaveDifferentIngredient() {
		Recipe underTest = new Recipe("George", "Blueberries");
		
		String ingredient = underTest.getIngredient();
		
		assertThat(ingredient, is("Blueberries"));
	}
	
	@Test
	public void recipeShouldHaveMultipleIngredients() {
		Recipe underTest = new Recipe("George", "Onions", "Blueberries");
		
		assertThat(underTest.getIngredients(), containsInAnyOrder("Onions", "Blueberries"));
	}
}