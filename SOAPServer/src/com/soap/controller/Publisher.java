package com.soap.controller;

import javax.xml.ws.Endpoint;


public class Publisher 
{
	public static void main(String[] args) 
	{
		Endpoint.publish("http://localhost:9993/PolicyInformationService", new ControllerClass());
	}
}