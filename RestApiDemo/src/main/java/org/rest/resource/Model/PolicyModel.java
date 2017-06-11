package org.rest.resource.Model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PolicyModel 
{
	private long policyNumber;
	private String policyType;
	private String policyTenure;
	private String policyStatus;
	private String username;
	private Date policyStartDate;
	private Date policyEndDate;
	
	public PolicyModel()
	{
		
	}
	
	public PolicyModel(long policyNumber, String policyType, String policyTenure, 
			String policyStatus, String username)
	{
		this.policyNumber = policyNumber;
		this.policyType = policyType;
		this.policyTenure = policyTenure;
		this.policyStatus = policyStatus;
		this.username = username;
		this.policyStartDate = new Date();
		this.policyEndDate = new Date();
	}
	
	public long getPolicyNumber() 
	{
		return policyNumber;
	}
	public void setPolicyNumber(long policyNumber) 
	{
		this.policyNumber = policyNumber;
	}
	
	public String getPolicyType() 
	{
		return policyType;
	}
	public void setPolicyType(String policyType) 
	{
		this.policyType = policyType;
	}
	
	public String getPolicyTenure() 
	{
		return policyTenure;
	}
	public void setPolicyTenure(String policyTenure) 
	{
		this.policyTenure = policyTenure;
	}
	
	public String getPolicyStatus() 
	{
		return policyStatus;
	}
	public void setPolicyStatus(String policyStatus) 
	{
		this.policyStatus = policyStatus;
	}
	
	public String getUsername() 
	{
		return username;
	}
	public void setUsername(String username) 
	{
		this.username = username;
	}
	
	public Date getPolicyStartDate() 
	{
		return policyStartDate;
	}
	public void setPolicyStartDate(Date policyStartDate) 
	{
		this.policyStartDate = policyStartDate;
	}
	
	public Date getPolicyEndDate() 
	{
		return policyEndDate;
	}
	public void setPolicyEndDate(Date policyEndDate) 
	{
		this.policyEndDate = policyEndDate;
	}
}