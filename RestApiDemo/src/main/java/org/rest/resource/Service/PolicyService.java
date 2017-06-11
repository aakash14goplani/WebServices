package org.rest.resource.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.rest.resource.DAO.DataBaseConnection;
import org.rest.resource.Exception.DataNotFoundException;
import org.rest.resource.Model.CustomerModel;
import org.rest.resource.Model.PolicyModel;

public class PolicyService 
{
	PolicyModel policyObject = null;
	private List<PolicyModel> policy = new ArrayList<PolicyModel>();
	private Map<Long, CustomerModel> users = DataBaseConnection.getUserStub();
	
	public List<PolicyModel> getAllWithId(long id) 
	{	
		String policyAssociated = "", username = "";
		Random r = new Random();
		String tenure = String.valueOf(r.nextInt(10)+1);
		
		for(CustomerModel temp : users.values())
		{
			if(temp.getId() == id)
			{
				policyAssociated = temp.getPolicyAssociated();
				username = temp.getUserName();
			}
		}
		
		policy.add(new PolicyModel(id, policyAssociated, tenure, "Active", username));		
		
		return policy;
	}

	public List<PolicyModel> addUpdatePolicy(PolicyModel policyModel) 
	{
		long policyNumber = policyModel.getPolicyNumber();
		String policyType = policyModel.getPolicyType();
		String policyTenure = policyModel.getPolicyTenure();
		String policyStatus = policyModel.getPolicyStatus();
		String username = policyModel.getUsername();
		
		policy.add(new PolicyModel(policyNumber, policyType, policyTenure, 
				policyStatus, username));
		return policy;
	}

	public List<PolicyModel> getId(long id) 
	{
		for(PolicyModel policyModel : policy)
		{
			if(policyModel.getPolicyNumber() == id)
			{
				long policyNumber = policyModel.getPolicyNumber();
				String policyType = policyModel.getPolicyType();
				String policyTenure = policyModel.getPolicyTenure();
				String policyStatus = policyModel.getPolicyStatus();
				String username = policyModel.getUsername();
				
				policy.add(new PolicyModel(policyNumber, policyType, policyTenure, 
						policyStatus, username));
				
				return policy;
			}
		}
		return null;
	}

	public boolean removeUser(long id) 
	{
		if(id <= 0)
		{
			throw new DataNotFoundException("Cannot delete record, Invalid id : " + id);
		}
		
		return policy.remove(id);	
	}
}