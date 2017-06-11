package org.soap.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlElement;

@XmlRootElement(name="ProductDetails")
@XmlType(propOrder={"name", "contact", "date"})
public class ProductDetails 
{
	String name;
	long contact;
	Date date;
	
	public ProductDetails()
	{
		
	}
	
	public ProductDetails(String name, long contact)
	{
		this.name = name;
		this.contact = contact;
		this.date = new Date();
	}
	
	@XmlElement(name="username")
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public long getContact() 
	{
		return contact;
	}
	public void setContact(long contact) 
	{
		this.contact = contact;
	}

	@XmlElement(name="dateJoined")
	public Date getDate() 
	{
		return date;
	}
	public void setDate(Date date) 
	{
		this.date = date;
	}
}