package org.cookseys.recipessite.controllerTest;

import static org.hamcrest.Matchers.contains;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;
import static org.hamcrest.Matchers.any;

import java.util.Collections;

import org.cookseys.recipessite.classTest.RecipeRepository;
import org.cookseys.recipessite.classes.Recipe;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class RecipeControllerTest {

	@InjectMocks
	private RecipeRestController underTest;
	
	@Mock
	private Recipe recipe;
	
	@Mock
	private RecipeRepository recipeRepo;
	
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void shouldRetrieveRecipes() {
		when(recipeRepo.findAll()).thenReturn(Collections.singleton(recipe));
		Iterable<Recipe> result = underTest.findRecipes();
		assertThat(result, contains(any(Recipe.class)));
	}
	
}
