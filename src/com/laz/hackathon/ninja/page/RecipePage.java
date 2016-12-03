package com.laz.hackathon.ninja.page;

import java.time.Duration;
import java.util.List;
import com.laz.hackathon.ninja.beans.*;

import com.laz.hackathon.ninja.beans.NutritionInformation;

public interface RecipePage {
	String getName();
	Duration getCookTime();
	String getCookingMethod();
	NutritionInformation getNutritionInformation();
	Duration getPrepTime();
	String getRecipeCategory();
	String getRecipeCuisine();
	List<RecipeIngredient> getIngredients();
	List<String> getInstructions();
}
