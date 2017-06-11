package org.rest.resource.Exception;

public class DataNotFoundException extends RuntimeException
{
	private static final long serialVersionUID = 1L;
	
	public DataNotFoundException(String message)
	{
		super(message);
	}
}