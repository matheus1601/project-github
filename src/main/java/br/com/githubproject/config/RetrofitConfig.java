package br.com.githubproject.config;

import static br.com.githubproject.config.JsonUtil.createGsonConverterFactory;

import retrofit2.Retrofit;

public class RetrofitConfig {

	public static <T> T createRepository(String baseUrl , Class<T> clazz) {
		Retrofit retrofit = new Retrofit.Builder()
										.baseUrl(baseUrl)
										.addConverterFactory(createGsonConverterFactory())
										.build();
		return retrofit.create(clazz);
	};
	
}
