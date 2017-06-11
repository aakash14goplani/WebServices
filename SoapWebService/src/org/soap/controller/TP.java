package org.soap.controller;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public class TP 
{
	@WebMethod
	@WebResult(name="info")
	public String getInfo(@WebParam(name="input") String input) throws MyException
	{
		String response = "Invalid";
		
		if(input.equalsIgnoreCase("aakash"))
			response = "Aakash Goplani";
		else
			throw new MyException("Invalid Input", input + " is not a valid parameter");
		return response;
	}
}