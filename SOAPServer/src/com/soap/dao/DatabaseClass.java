package com.soap.dao;

import java.util.HashMap;
import java.util.Map;

import com.soap.model.Customer;
import com.soap.model.Policy;

public class DatabaseClass
{
	static Map<Long, Customer> userStub = new HashMap<>();
	static Map<Long, Policy> policyStub = new HashMap<>();
	
	public static Map<Long, Customer> getUserStub() 
	{
		userStub.put(1l, new Customer(1, "Aakash Goplani", "India", "8600223633", 18));
		userStub.put(2l, new Customer(2, "Demo Name", "USA", "999666331", 5));
		return userStub;
	}
	
	public static Map<Long, Policy> getPolicyStub() 
	{
		policyStub.put(123456l, new Policy(123456, 1, "AARP", 18, "Active"));
		policyStub.put(654987l, new Policy(654987, 2, "USAA", 10, "Active"));
		return policyStub;
	}
}