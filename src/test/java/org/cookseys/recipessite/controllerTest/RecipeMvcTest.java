package org.cookseys.recipessite.controllerTest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import javax.annotation.Resource;

import org.cookseys.recipessite.classTest.RecipeRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest(RecipeRestController.class)
public class RecipeMvcTest {

	@Resource
	MockMvc mvc;
	
	@MockBean
	private RecipeRepository recipeRepo;
	
	@Test
	public void shouldRetrieveRecipes() throws Exception {
		mvc.perform(get("/recipes-object")).andExpect(status().isOk());
	}
}
