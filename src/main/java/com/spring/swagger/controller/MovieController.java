package com.spring.swagger.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.swagger.model.Movie;

@RestController
@RequestMapping("/api/movie")
public class MovieController 
{
	private static List<Movie> movies = new ArrayList<Movie>();
	@PostMapping
	public Movie addMovies(@RequestBody Movie movie)
	{
		movies.add(movie);
		return movie;
		
	}
	
	@GetMapping
	public List<Movie> getAll()
	{
		return movies;
	}

}
