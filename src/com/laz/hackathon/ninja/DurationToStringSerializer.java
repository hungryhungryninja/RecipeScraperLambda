package com.laz.hackathon.ninja;

import java.io.IOException;
import java.time.Duration;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class DurationToStringSerializer extends JsonSerializer<Duration> {

	@Override
	public void serialize(Duration duration, JsonGenerator jsonGenerator, SerializerProvider serializerProvider)
			throws IOException, JsonProcessingException {
		
		
		jsonGenerator.writeObject(duration.toString());
	}
	
}
