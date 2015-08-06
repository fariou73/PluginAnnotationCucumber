package com.simbirsoft.plugin;

import com.simbirsoft.annotations.*;

@PluginAnnotation(name = "Main-class")
public class Main {
    Ingredient ingredient = new Ingredient("Cucumber", 100);

    public static void main(String[] args) {

    }

    @GetIngredientMethodAnnotation(method = "GetMethod")
    public int getIngredientsCount() {
        return ingredient.getIngredientCount();
    }

    @GetIngredientNameMethodAnnotation(method = "GetNameMethod")
    public String getIngredientName(){
        return ingredient.getIngredientsName();
    }
}
