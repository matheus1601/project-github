package br.com.githubproject.service;

import static br.com.githubproject.config.JsonUtil.fromJson;
import static br.com.githubproject.config.RetrofitConfig.createRepository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.google.gson.reflect.TypeToken;

import br.com.githubproject.models.RepositorySummary;
import br.com.githubproject.repository.APIGithubRepository;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Response;

@Service
public class GithubService {
	
	public List<RepositorySummary> listRepositories(String username){
		try {
			Call<ResponseBody> call = createRepository("https://api.github.com/", APIGithubRepository.class).listaRepositorios(username);
			Response<ResponseBody> response = call.execute();
			return fromJson(response.body().string(), new TypeToken<ArrayList<RepositorySummary>>() {}.getType());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
