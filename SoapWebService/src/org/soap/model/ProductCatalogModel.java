package org.soap.model;

import java.util.ArrayList;
import java.util.List;

public class ProductCatalogModel 
{
	List<String> categories = new ArrayList<String>();
	List<String> books = new ArrayList<String>();
	List<String> music = new ArrayList<String>();
	List<String> movies = new ArrayList<String>();
	
	public ProductCatalogModel()
	{
		categories.add("Books");
		categories.add("Music");
		categories.add("Movies");
		
		books.add("JAVA");
		books.add("PHP");
		books.add("C++");
		
		music.add("ROCK");
		music.add("METAL");
		music.add("POP");
		
		movies.add("HORROR");
		movies.add("ACTION");
		movies.add("ANIMATION");
	}
	
	public List<String> getCategories() 
	{
		return categories;
	}
	public void setCategories(List<String> categories) 
	{
		this.categories = categories;
	}

	public List<String> getBooks() 
	{
		return books;
	}
	public void setBooks(List<String> books) 
	{
		this.books = books;
	}
	
	public List<String> getMusic() 
	{
		return music;
	}
	public void setMusic(List<String> music) 
	{
		this.music = music;
	}
	
	public List<String> getMovies() 
	{
		return movies;
	}
	public void setMovies(List<String> movies) 
	{
		this.movies = movies;
	}
}