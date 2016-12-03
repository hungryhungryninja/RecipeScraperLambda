package com.laz.hackathon.ninja.beans;

import java.time.Duration;
import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.laz.hackathon.ninja.DurationToStringSerializer;
import com.laz.hackathon.ninja.page.RecipePage;

public class Recipe {
	
	private String name;
	
	@JsonSerialize(using = DurationToStringSerializer.class, as=Duration.class)
	private Duration cookTime;
	
	@JsonSerialize(using = DurationToStringSerializer.class, as=Duration.class)
	private Duration prepTime;
	
	private String cookingMethod;
	
	private NutritionInformation nutritionInformation;
	
	private String recipeCategory;
	
	private String recipeCuisine;
	
	private List<RecipeIngredient> ingredients;
	
	private List<String> instructions;
	
	public Recipe( RecipePage page ) {
		this.name = page.getName();
		this.cookTime = page.getCookTime();
		this.prepTime = page.getPrepTime();
		this.cookingMethod = page.getCookingMethod();
		this.nutritionInformation = page.getNutritionInformation();
		this.recipeCategory = page.getRecipeCategory();
		this.recipeCuisine = page.getRecipeCuisine();
		this.ingredients = page.getIngredients();
		this.instructions = page.getInstructions();
	}
	
	public String getName() {
		return name;
	}
	
	public Duration getCookTime() {
		return cookTime;
	}
	
	public Duration getPrepTime() {
		return prepTime;
	}
	
	public String getCookingMethod() {
		return cookingMethod;
	}
	
	public NutritionInformation getNutritionInformation() {
		return nutritionInformation;
	}
	
	public String getRecipeCategory() {
		return recipeCategory;
	}
	
	public String getRecipeCuisine() {
		return recipeCuisine;
	}
	
	public List<RecipeIngredient> getIngredients() {
		return ingredients;
	}
	
	public List<String> getInstructions() {
		return instructions;
	}	
	
}