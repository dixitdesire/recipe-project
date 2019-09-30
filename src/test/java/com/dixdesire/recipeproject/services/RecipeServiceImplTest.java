package com.dixdesire.recipeproject.services;

import com.dixdesire.recipeproject.model.Recipe;
import com.dixdesire.recipeproject.repositories.RecipeRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class RecipeServiceImplTest {

    RecipeServiceImpl recipeService;

    @Mock
    RecipeRepository recipeRepository;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        recipeService = new RecipeServiceImpl(recipeRepository);
    }

    @Test
    public void getRecipes() {

        Recipe recipe = new Recipe();
        HashSet hashSet = new HashSet();
        hashSet.add(recipe);

        when(recipeService.getRecipes()).thenReturn(hashSet);

        Set<Recipe> recipes = recipeService.getRecipes();
        assertEquals(recipes.size(), hashSet.size());
        verify(recipeRepository, times(1)).findAll();

    }
}