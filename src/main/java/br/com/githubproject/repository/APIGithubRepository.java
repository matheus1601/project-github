package br.com.githubproject.repository;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface APIGithubRepository {

	@GET("users/{username}/repos")
	Call<ResponseBody> listaRepositorios(@Path("username") final String username);
}
