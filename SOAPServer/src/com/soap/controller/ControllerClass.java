package com.soap.controller;

import java.util.List;

import javax.jws.WebService;

import com.soap.exception.MyCustomException;
import com.soap.implementation.PolicyInterface;
import com.soap.model.Customer;
import com.soap.model.Policy;
import com.soap.service.ServiceClass;

@WebService(serviceName="PolicyInformationService", portName="Policy", endpointInterface=
		"com.soap.implementation.PolicyInterface")
public class ControllerClass implements PolicyInterface
{
	ServiceClass service = new ServiceClass();
	
	@Override
	public List<Customer> getAllUserDetails() 
	{
		return service.getAllUserDetails();
	}

	@Override
	public List<Policy> getAllPolicyDetails() 
	{
		return service.getAllPolicyDetails();
	}

	@Override
	public Customer getUserById(long id) throws MyCustomException 
	{
		return service.getUserById(id);
	}

	@Override
	public Policy getPolicyById(long id) throws MyCustomException 
	{
		return service.getPolicyById(id);
	}

	@Override
	public Customer getUserByName(String username) throws MyCustomException 
	{
		return service.getUserByName(username);
	}

	@Override
	public Policy getPolicyByName(String policyname) throws MyCustomException 
	{
		return service.getPolicyByName(policyname);
	}
}