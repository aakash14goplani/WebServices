package org.rest.resource.Exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.rest.resource.Model.ErrorMessage;;

@Provider
public class AllExceptionMapper implements ExceptionMapper<Throwable> 
{
	@Override
	public Response toResponse(Throwable ex) 
	{
		ErrorMessage errorMessage = new ErrorMessage(ex.getMessage(), 500, 
				"For help, please visit : http://www.someDocumentationLink.com");
		
		return Response.status(Status.INTERNAL_SERVER_ERROR)
				.entity(errorMessage)
				.build();
	}
}