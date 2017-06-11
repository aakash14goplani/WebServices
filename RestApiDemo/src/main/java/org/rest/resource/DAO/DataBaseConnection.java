package org.rest.resource.DAO;

import java.util.HashMap;
import java.util.Map;

import org.rest.resource.Model.CustomerModel;
//import org.rest.resource.Model.PolicyModel;

public class DataBaseConnection 
{
	private static Map<Long, CustomerModel> userStub = new HashMap<>();
	//private static Map<Long, PolicyModel> policyStub = new HashMap<>();

	public static Map<Long, CustomerModel> getUserStub() 
	{
		return userStub;
	}

	/*public static Map<Long, PolicyModel> getPolicyStub() 
	{
		return policyStub;
	}*/
}