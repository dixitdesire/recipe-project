package com.dixdesire.recipeproject.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CategoryTest {

    Category category;

    @Before
    public void setUp(){
        category = new Category();
    }

    @Test
    public void getId() {
        Long idValue = 2l;
        category.setId(idValue);
        assertEquals(idValue, category.getId());
    }

    @Test
    public void getCategoryName() {
    }

    @Test
    public void getRecipes() {
    }
}