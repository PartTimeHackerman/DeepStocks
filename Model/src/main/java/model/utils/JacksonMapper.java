package model.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class JacksonMapper {
	
	private static final ObjectMapper objectMapper = new ObjectMapper();
	
	static {
		objectMapper.enableDefaultTyping(ObjectMapper.DefaultTyping.OBJECT_AND_NON_CONCRETE);
	}
	
	public static String toJson(Object o) throws JsonProcessingException {
		return objectMapper.writeValueAsString(o);
	}
	
	public static <T> T fromJson(String json, Class<T> clazz) throws IOException {
		return objectMapper.readValue(json, clazz);
	}
}
