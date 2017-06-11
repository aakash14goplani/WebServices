package com.soap.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="PolicyDetails")
@XmlType(propOrder={"policyNumber", "userId", "policyType", "policyTenure", "policyStatus", 
		"policyStartDate", "policyEndDate"})
public class Policy 
{
	private long policyNumber;
	private long userId;
	private String policyType;
	private int policyTenure;
	private String policyStatus;
	private Date policyStartDate;
	private Date policyEndDate;
	
	public Policy()
	{
		
	}
	
	public Policy(long policyNumber, long userId, String policyType, int policyTenure, 
			String policyStatus)
	{
		this.policyNumber = policyNumber;
		this.userId = userId;
		this.policyType = policyType;
		this.policyTenure = policyTenure;
		this.policyStatus = policyStatus;
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
	
	@XmlElement(name="customerId")
	public long getUserId() 
	{
		return userId;
	}
	public void setUserId(long userId) 
	{
		this.userId = userId;
	}

	public String getPolicyType() 
	{
		return policyType;
	}
	public void setPolicyType(String policyType) 
	{
		this.policyType = policyType;
	}
	
	public int getPolicyTenure() 
	{
		return policyTenure;
	}
	public void setPolicyTenure(int policyTenure) 
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