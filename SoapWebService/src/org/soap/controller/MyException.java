package org.soap.controller;

public class MyException extends Exception 
{
	private static final long serialVersionUID = -6947905423117936171L;
	
	private String message;
	
	public MyException(String error, String message) 
	{
		super(error);
		this.message = message;
	}
	
	public String getErrorInfo()
	{
		return message;
	}
}