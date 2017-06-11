package org.rest.resource.Model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.rest.resource.Model.Link;

@XmlRootElement
public class CustomerModel 
{
	private long id;
	private String userName;
	private String userRole;
	private String policyAssociated;
	private String hartFordTenureMonths;
	private List<Link> links = new ArrayList<>();
	
	public CustomerModel()
	{
		
	}
	
	public CustomerModel(long id, String userName, String userRole, String policyAssociated, 
			String hartFordTenureMonths)
	{
		this.id = id;
		this.userName = userName;
		this.userRole = userRole;
		this.policyAssociated = policyAssociated;
		this.hartFordTenureMonths = hartFordTenureMonths;
	}
	
	public long getId() 
	{
		return id;
	}
	public void setId(long id) 
	{
		this.id = id;
	}
	
	public String getUserName() 
	{
		return userName;
	}
	public void setUserName(String userName) 
	{
		this.userName = userName;
	}
	
	public String getUserRole() 
	{
		return userRole;
	}
	public void setUserRole(String userRole) 
	{
		this.userRole = userRole;
	}
	
	public String getPolicyAssociated() 
	{
		return policyAssociated;
	}
	public void setPolicyAssociated(String policyAssociated) 
	{
		this.policyAssociated = policyAssociated;
	}
	
	public String getHartFordTenureMonths() 
	{
		return hartFordTenureMonths;
	}
	public void setHartFordTenureMonths(String hartFordTenureMonths) 
	{
		this.hartFordTenureMonths = hartFordTenureMonths;
	}
		
	public List<Link> getLinks() 
	{
		return links;
	}
	public void setLinks(List<Link> links) 
	{
		this.links = links;
	}
	
	public void addLink(String url, String rel) 
	{
		Link link = new Link();
		
		link.setLink(url);
		link.setRel(rel);
		
		links.add(link);
	}
}