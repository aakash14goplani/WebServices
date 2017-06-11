package com.soap.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.soap.dao.DatabaseClass;
import com.soap.exception.MyCustomException;
import com.soap.model.Customer;
import com.soap.model.Policy;

public class ServiceClass 
{
	Customer customerModel = new Customer();
	Policy policyModel = new Policy();
	Map<Long, Customer> customerStub = DatabaseClass.getUserStub();
	Map<Long, Policy> policyStub = DatabaseClass.getPolicyStub();
	
	public List<Customer> getAllUserDetails()
	{
		return new ArrayList<>(customerStub.values());
	}
	
	public List<Policy> getAllPolicyDetails()
	{
		return new ArrayList<>(policyStub.values());
	}
	
	public Customer getUserById(long id) throws MyCustomException 
	{
		if(id < 0 || id > 3)
		{
			throw new MyCustomException("Invalid id", "user details with "+id+" not found");
		}
		else
		{
			customerModel.setId(customerStub.get(id).getId());
			customerModel.setUserName(customerStub.get(id).getUserName());
			customerModel.setaddress(customerStub.get(id).getaddress());
			customerModel.setcontact(customerStub.get(id).getcontact());
			customerModel.setHartFordTenureMonths(customerStub.get(id).getHartFordTenureMonths());
			return customerModel;
		}	
	}

	public Policy getPolicyById(long id) throws MyCustomException 
	{
		if(id == 123456 || id == 654987)
		{
			policyModel.setPolicyNumber(policyStub.get(id).getPolicyNumber());
			policyModel.setUserId(policyStub.get(id).getUserId());
			policyModel.setPolicyType(policyStub.get(id).getPolicyType());
			policyModel.setPolicyTenure(policyStub.get(id).getPolicyTenure());
			policyModel.setPolicyStatus(policyStub.get(id).getPolicyStatus());
			policyModel.setPolicyStartDate(policyStub.get(id).getPolicyStartDate());
			policyModel.setPolicyEndDate(policyStub.get(id).getPolicyEndDate());
			return policyModel;
		}
		else
		{
			throw new MyCustomException("Invalid id", "policy details with "+id+" not found");		
		}	
	}
	
	public Customer getUserByName(String username) throws MyCustomException 
	{
		boolean flag = false;
		for(Map.Entry<Long, Customer> entry : customerStub.entrySet())
		{
			customerModel = entry.getValue();
			String name = customerModel.getUserName();
			System.out.println(name);
			
			if(name.equalsIgnoreCase(username))
				flag = true;
			else
				continue;
		}
		if(flag)
			return customerModel;
		else
			throw new MyCustomException("Invalid User Name", "No such '"+username+"' found");	
	}
	
	public Policy getPolicyByName(String policyname) throws MyCustomException 
	{
		boolean flag = false;
		for(Map.Entry<Long, Policy> entry : policyStub.entrySet())
		{
			policyModel = entry.getValue();
			String name = policyModel.getPolicyType();
			System.out.println(name);
			
			if(name.equalsIgnoreCase(policyname))
				flag = true;
			else
				continue;
		}
		if(flag)
			return policyModel;
		else
			throw new MyCustomException("Invalid User Name", "No such '"+policyname+"' found");		
	}
}