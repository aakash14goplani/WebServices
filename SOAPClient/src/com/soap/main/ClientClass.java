package com.soap.main;

import java.util.List;

import org.soap.controller.ProductCatalogInterface;
import org.soap.controller.ProductCatalogService;
import org.soap.controller.ProductDetails;

public class ClientClass 
{
	public static void main(String[] args)
	{
		//create a service defines in WSDL
		ProductCatalogService service = new ProductCatalogService();
		
		//create a port(usually interface name)
		ProductCatalogInterface detail = service.getProductCatalogPort();
		
		//access the details
		
		List<String> categories = detail.getProductCategories();
		
		List<String> movies = detail.getProduct("movies");
		
		boolean add = detail.addProduct("movies", "star");
		
		List<ProductDetails> music = detail.getProductV2("music");
		
		for(ProductDetails d : music)
		{
			System.out.println(d.getContact()+"\n"+d.getUsername()+"\n"+d.getDateJoined()+"\n");
		}
		
		System.out.println(categories+"\n"+movies+"\n"+add+"\n"+music);
	}
}