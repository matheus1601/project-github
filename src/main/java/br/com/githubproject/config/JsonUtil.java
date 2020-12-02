package br.com.githubproject.config;

import java.lang.reflect.Type;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.converter.gson.GsonConverterFactory;

public class JsonUtil {

	private JsonUtil(){
    }

	public static GsonConverterFactory createGsonConverterFactory() {
		return GsonConverterFactory.create(createGson());
	}
	
	public static GsonBuilder createGsonBuilder() {
		return new GsonBuilder().setLenient()
				 .setPrettyPrinting()
				 .excludeFieldsWithoutExposeAnnotation();
	}
	
	public static Gson createGson() {
		return createGsonBuilder().create();
	}
	
	public static <T> T fromJson(String json, Type typeOfT) {
		Gson gson = new Gson();
		return gson.fromJson(json, typeOfT);
	}
	
}
