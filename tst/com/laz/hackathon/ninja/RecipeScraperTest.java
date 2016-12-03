package com.laz.hackathon.ninja;

import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.Test;

import com.amazonaws.services.lambda.runtime.Context;

/**
 * A simple test harness for locally invoking your Lambda function handler.
 */
public class RecipeScraperTest {

    private static String input;

    @BeforeClass
    public static void createInput() throws IOException {
        //input = "http://veganlovlie.com/one-bowl-vanilla-chocolate-mug-cake/";
    	//input = "http://allrecipes.com/recipe/7304/eclair-cake/";
    	//input = "http://www.foodnetwork.com/recipes/baked-brie-recipe.html";
    	input = "http://veganlovlie.com/my-best-veggie-burger-does-not-fall/";
    }

    private Context createContext() {
        TestContext ctx = new TestContext();

        ctx.setFunctionName("RecipeScraper");

        return ctx;
    }

    @Test
    public void testRecipeScraper() {
        RecipeScraper handler = new RecipeScraper();
        Context ctx = createContext();

        Object output = handler.handleRequest(input, ctx);

        // TODO: validate output here if needed.
        if (output != null) {
            System.out.println(output.toString());
        }
    }
}
