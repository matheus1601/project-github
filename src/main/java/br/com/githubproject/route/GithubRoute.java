package br.com.githubproject.route;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.githubproject.models.RepositorySummary;
import br.com.githubproject.service.GithubService;

@RestController
@RequestMapping(path = "github", produces = "application/json")
public class GithubRoute {

	@Autowired
	private GithubService service;
	
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	@GetMapping("/list/{username}")
	public List<RepositorySummary> listAll(@PathVariable final String username) {
		return service.listRepositories(username);
	}
}
