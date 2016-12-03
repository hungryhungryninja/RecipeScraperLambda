package com.laz.hackathon.ninja.page;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import com.laz.hackathon.ninja.beans.Mass;
import com.laz.hackathon.ninja.beans.NutritionInformation;
import com.laz.hackathon.ninja.beans.RecipeIngredient;

public class SchemaOrgRecipePage extends JsoupPage implements RecipePage {
	
	private Element recipeElement; 

	public SchemaOrgRecipePage(String url) throws IOException {
		super(url);
		//assume we just want the first recipe
		this.recipeElement = this.getRecipes().get(0);
	}

	@Override
	public String getName() {
		return this.getFirstValueOrBlankString("name");
	}

	@Override
	public Duration getCookTime() {
		return this.getFirstDurationOrNull("cookTime");
	}

	@Override
	public String getCookingMethod() {
		return this.getFirstValueOrBlankString("cookingMethod");
	}

	@Override
	public NutritionInformation getNutritionInformation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Duration getPrepTime() {
		return this.getFirstDurationOrNull("prepTime");
	}

	@Override
	public String getRecipeCategory() {
		return this.getFirstValueOrBlankString("recipeCategory");
	}

	@Override
	public String getRecipeCuisine() {
		return this.getFirstValueOrBlankString("recipeCuisine");
	}

	@Override
	public List<RecipeIngredient> getIngredients() {
		List<RecipeIngredient> ingredients = new ArrayList<RecipeIngredient>();
		List<Element> ingredientElements = recipeElement.getElementsByAttributeValue("itemprop", "ingredients");
		
		for (Element element : ingredientElements) {
			//The ingredient spec does now allow for amount. It only has a single text field. The end user will need to fix this.
			Mass amount = new Mass("", null);
			ingredients.add(new RecipeIngredient(element.text(), amount));
		}
		
		return ingredients;
	}
	
	@Override
	public List<String> getInstructions() {
		List<String> instructions = new ArrayList<String>();
		List<Element> instructionElements = recipeElement.getElementsByAttributeValue("itemprop", "recipeInstructions");
		
		for (Element element : instructionElements) {
			instructions.add(element.text());
		}
		
		return instructions;
	}
	
	private String getFirstValueOrBlankString(String fieldName) {
		List<Element> elements = recipeElement.getElementsByAttributeValue("itemprop", fieldName);
		String value = "";
		
		if ( elements.size() > 0 ) {
			for (Element element : elements) {
				if ( !element.attr("content").isEmpty() ) {
					return element.attr("content");
				}
				else if ( !element.text().isEmpty() ) {
					return element.text();
				}
			}
		}
		
		return value;
	}
	
	private Duration getFirstDurationOrNull(String fieldName) {
		List<Element> elements = recipeElement.getElementsByAttributeValue("itemprop", fieldName);
		
		Duration duration = null;
		if ( elements.size() > 0 ) {
			for (Element element : elements) {
				if ( !element.attr("content").isEmpty() ) {
					return Duration.parse(elements.get(0).attr("content"));
				}
				else if ( !elements.get(0).attr("datetime").isEmpty() ) {
					return Duration.parse(elements.get(0).attr("datetime"));
				}
			}
		}
		
		
		
		return duration ;
	}
	
	private List<Element> getRecipes() {
		return this.getDocument().getElementsByAttributeValue("itemtype", "http://schema.org/Recipe");
	}

	

}
