package org.soap.controller;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import org.soap.model.ProductDetails;

//@WebService(name="Aakash", targetNamespace="http://aakash14goplani.github.io")

@SOAPBinding(style=Style.DOCUMENT)
@WebService
public interface ProductCatalogInterface 
{
	@WebMethod
	public List<String> getProductCategories();

	@WebMethod
	@WebResult(name="lookupOutput")
	public List<String> getProduct(@WebParam(name="lookupInput") String Category);

	@WebMethod
	public boolean addProduct(String category, String product);

	@WebMethod(exclude=false, operationName="deleteIT", action="delete_soap")
	public boolean deleteProduct(String category, String product);
	
	//returning custom data type
	@WebMethod
	@WebResult(name="ProductDetails")
	public List<ProductDetails> getProductV2(@WebParam(name="productInput") String Category);
}