package org.soap.controller;

import javax.xml.ws.Endpoint;

public class PublishWebService 
{
	public static void main(String[] args) 
	{
		Endpoint.publish("http://localhost:9993/productservice", new ProductCatalog());
	}
}