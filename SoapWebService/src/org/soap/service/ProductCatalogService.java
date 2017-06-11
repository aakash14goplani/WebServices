package org.soap.service;

import java.util.ArrayList;
import java.util.List;

import org.soap.model.ProductCatalogModel;
import org.soap.model.ProductDetails;

public class ProductCatalogService 
{
	ProductCatalogModel model = new ProductCatalogModel();
	
	public List<String> getProductCategories()
	{
		return model.getCategories();
	}
	
	public List<String> getProduct(String category)
	{
		switch(category.toLowerCase())
		{
			case "books" :	return model.getBooks();
			
			case "music" : return model.getMusic();
			
			case "movies" : return model.getMovies();
			
			default : return null;
		}
	}
	
	public boolean addProduct(String category, String product)
	{
		switch(category.toLowerCase())
		{
			case "books" :	model.getBooks().add(product);
							break;
							
			case "music" : model.getMusic().add(product);
							break;
							
			case "movies" : model.getMovies().add(product);
							break;
			
			default : return false;
		}	
		return true;
	}
	
	public boolean deleteProduct(String category, String product)
	{
		switch(category.toLowerCase())
		{
			case "books" :	model.getBooks().remove(product);
							break;
							
			case "music" : model.getMusic().remove(product);
							break;
							
			case "movies" : model.getMovies().remove(product);
							break;
			
			default : return false;
		}	
		return true;
	}

	public List<ProductDetails> getProductV2(String category) 
	{
		List<ProductDetails> tempList = new ArrayList<>();
		
		tempList.add(new ProductDetails("Aakash", 860022363));
		tempList.add(new ProductDetails("Goplani", 775894546));
		
		return tempList;
	}
}