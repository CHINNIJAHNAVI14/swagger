package com.spring.swagger.model;


public class Movie 
{
	private String name;
	private String actor;
	
	public Movie() {}
	
	public Movie(String name, String actor)
	{
		
		this.name = name;
		this.actor = actor;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	
	

}
