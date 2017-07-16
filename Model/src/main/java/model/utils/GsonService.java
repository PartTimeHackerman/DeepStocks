package model.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class GsonService {
	
	private static final JsonParser parser = new JsonParser();
	private static final Gson prettyPrinter = new GsonBuilder().setPrettyPrinting().create();
	private static final Gson gson = new Gson();
	
	public static String toPrettyFormat(String jsonString) {
		JsonObject json = parser.parse(jsonString).getAsJsonObject();
		return prettyPrinter.toJson(json);
	}
	
	public static Gson getGson() {
		return gson;
	}
}
