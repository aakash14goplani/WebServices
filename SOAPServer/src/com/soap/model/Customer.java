package com.soap.model;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="CustomerDetails")
@XmlType(propOrder={"id", "userName", "address", "contact", "hartFordTenureMonths"})
public class Customer 
{
	private long id;
	private String userName;
	private String address;
	private String contact;
	private int hartFordTenureMonths;
	
	public Customer()
	{
		
	}
	
	public Customer(long id, String userName, String address, String contact, int hartFordTenureMonths)
	{
		this.id = id;
		this.userName = userName;
		this.address = address;
		this.contact = contact;
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
	
	public String getaddress() 
	{
		return address;
	}
	public void setaddress(String address) 
	{
		this.address = address;
	}
	
	public String getcontact() 
	{
		return contact;
	}
	public void setcontact(String contact) 
	{
		this.contact = contact;
	}
	
	public int getHartFordTenureMonths() 
	{
		return hartFordTenureMonths;
	}
	public void setHartFordTenureMonths(int hartFordTenureMonths) 
	{
		this.hartFordTenureMonths = hartFordTenureMonths;
	}
}