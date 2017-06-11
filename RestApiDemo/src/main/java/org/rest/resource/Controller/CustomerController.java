package org.rest.resource.Controller;

import java.util.List;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

import org.rest.resource.Bean.BeanClass;
import org.rest.resource.Model.CustomerModel;
import org.rest.resource.Service.CustomerService;


@Path("/user")
@Consumes(value={MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
@Produces(value={MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
public class CustomerController 
{
	CustomerService service = new CustomerService();
	
	@GET
	public List<CustomerModel> getAllValues(@BeanParam BeanClass bean)
	{
		if(bean.getStart() >= 0 && bean.getSize() > 0)
			return service.getAllValuesPagination(bean.getStart(), bean.getSize());
		
		return service.getAllValues();
	}
	
	@GET
	@Path("/{id}")
	public CustomerModel getValueById(@PathParam("id") long id, @Context UriInfo uri)
	{
		CustomerModel object = service.getAllValuesById(id);
		
		object.addLink(getUriForSelf(uri, object), "self");
		object.addLink(getUriForPolicy(uri, object), "policy");
		
		return object;
	}
	
	private String getUriForPolicy(UriInfo uriInfo, CustomerModel object) {
		String uri = uriInfo.getBaseUriBuilder()
				.path(CustomerController.class)
	       		.path(CustomerController.class, "getPolicy")
	       		.path(PolicyController.class)
	       		.resolveTemplate("id", object.getId())
	            .build().toString();
	    return uri;
	}

	private String getUriForSelf(UriInfo uriInfo, CustomerModel object) {
		String uri = uriInfo.getBaseUriBuilder()
		 .path(CustomerController.class)
		 .path(Long.toString(object.getId()))
		 .build()
		 .toString();
		return uri;
	}
	
	@POST
	public CustomerModel addUser(CustomerModel object)
	{
		return service.addUser(object);
	}
	
	@PUT
	@Path("/{id}")
	public CustomerModel updateUser(@PathParam("id") long id, CustomerModel object)
	{
		object.setId(id);
		return service.updateUser(object);
	}
	
	@DELETE
	@Path("/{id}")
	public void deleteUser(@PathParam("id") long id)
	{
		service.removeUser(id);
	}
	
	@Path("/{id}/policy")
	public PolicyController getPolicy()
	{
		return new PolicyController();
	}
}
