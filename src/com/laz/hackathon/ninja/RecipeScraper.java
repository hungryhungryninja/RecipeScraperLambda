package com.laz.hackathon.ninja;

import java.io.IOException;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.laz.hackathon.ninja.beans.Recipe;
import com.laz.hackathon.ninja.page.RecipePage;
import com.laz.hackathon.ninja.page.SchemaOrgRecipePage;

public class RecipeScraper implements RequestHandler<String, Object> {

	
    @Override
    public Object handleRequest(String url, Context context) {
        context.getLogger().log("Input: " + url);
        String jsonRecipe = null;
        Recipe recipe = null;
        
        try {
			RecipePage recipePage = new SchemaOrgRecipePage(url);
			recipe = new Recipe(recipePage);
			//jsonRecipe = JsonMapper.mapJson(recipe);
			
		} catch (JsonProcessingException e) {
			context.getLogger().log("Failed to parse recipe to json: " + e.getMessage());
		}
        catch (IOException e) {
        	context.getLogger().log("Failed to get url: " + e.getMessage());
		}
        return recipe;
    }
}
