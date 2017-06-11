package org.rest.resource.Controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.rest.resource.Model.PolicyModel;
import org.rest.resource.Service.PolicyService;

@Path("/")
@Consumes(value={MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
@Produces(value={MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
public class PolicyController 
{
	private PolicyService service = new PolicyService();
	
	@GET
	public List<PolicyModel> getPolicyWithId(@PathParam("id") long id)
	{
		return service.getAllWithId(id);
	}
	
	@GET
	@Path("/{id}")
	public List<PolicyModel> getId(@PathParam("id") long id)
	{
		return service.getId(id);
	}
	
	@POST
	public List<PolicyModel> addPolicy(PolicyModel policyModel)
	{
		return service.addUpdatePolicy(policyModel);
	}
	
	@PUT
	@Path("/{id}")
	public List<PolicyModel> updatePolicy(@PathParam("id") long id, PolicyModel policyModel)
	{
		return service.addUpdatePolicy(policyModel);
	}
	
	@DELETE
	@Path("/{id}")
	public void deletePolicy(@PathParam("id") long id)
	{
		service.removeUser(id);
	}
}