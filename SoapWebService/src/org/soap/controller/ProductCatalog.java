package org.soap.controller;

import java.util.List;

import javax.jws.WebService;

import org.soap.model.ProductDetails;
import org.soap.service.ProductCatalogService;

//@WebService(portName="Goplani", serviceName="AccentureSoap")
//portName and serviceName are to be provided in the controller class, not in the interface class

@WebService(endpointInterface="org.soap.controller.ProductCatalogInterface")
public class ProductCatalog implements ProductCatalogInterface 
{
	ProductCatalogService service = new ProductCatalogService();
	
	@Override
	public List<String> getProductCategories()
	{
		return service.getProductCategories();
	}
	
	@Override	
	public List<String> getProduct(String Category)
	{
		return service.getProduct(Category);
	}
	
	@Override
	public boolean addProduct(String category, String product)
	{
		return service.addProduct(category, product);
	}
	
	@Override
	public boolean deleteProduct(String category, String product)
	{
		return service.deleteProduct(category, product);
	}

	@Override
	public List<ProductDetails> getProductV2(String Category) 
	{
		return service.getProductV2(Category);
	}
}