package br.com.githubproject.models;

import java.util.Date;

import com.google.gson.annotations.SerializedName;

import lombok.Data;

@Data
public class RepositorySummary {

	    public String name;
	    
	    public String full_name;
	    
	    @SerializedName("private")
	    public boolean _private;
	    
	    public RepositoryOwner owner;

	    public String description;
	    
	    public String url;
	    
	    public String created_at;
	    
	    public String updated_at;
	    
	    public String language;
}
