package com.soap.exception;

public class MyCustomException extends Exception 
{
	private static final long serialVersionUID = 1L;

	private String message;
	
	public MyCustomException(String error, String message) 
	{
		super(error);
		this.message = message;
	}
	
	public String getErrorInfo()
	{
		return message;
	}
}