package com.laz.hackathon.ninja;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.laz.hackathon.ninja.beans.Recipe;

public class JsonMapper {
	public static String mapJson(Recipe recipe) throws JsonProcessingException {
		ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
		return ow.writeValueAsString(recipe);
	}
}
