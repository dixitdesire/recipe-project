package com.dixdesire.recipeproject.controller;

import com.dixdesire.recipeproject.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {


    private RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "index", "index.html"})
    public String getRecipes(Model model){
        model.addAttribute("recipes", recipeService.getRecipes());
        return "index";
    }

}
