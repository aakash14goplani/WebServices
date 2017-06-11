package org.rest.resource.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.rest.resource.DAO.DataBaseConnection;
import org.rest.resource.Exception.DataNotFoundException;
import org.rest.resource.Model.CustomerModel;

public class CustomerService 
{
	private Map<Long, CustomerModel> users = DataBaseConnection.getUserStub();
	CustomerModel object = null;
	
	public CustomerService()
	{
		users.put(1L, new CustomerModel(1, "AakashGoplani", "PrimaryUser", "AARP", 
				"14"));
		users.put(2L, new CustomerModel(2, "AkshayAnbhawane", "StandardUser", "USSA", 
				"20"));
		users.put(3L, new CustomerModel(3, "AkshataRaikar", "PrimaryUser", "AARP", 
				"10"));
		users.put(4L, new CustomerModel(4, "RewaAmbar", "StandardUser", "USSA", 
				"30"));
	}
	
	public List<CustomerModel> getAllValues()
	{
		return new ArrayList<CustomerModel>(users.values());
	}
	
	public List<CustomerModel> getAllValuesPagination(int start, int size)
	{
		ArrayList<CustomerModel> list = new ArrayList<CustomerModel>(users.values());
		
		if(start + size > list.size())
			return new ArrayList<CustomerModel>();
		
		return list.subList(start, start+size);
	}

	public CustomerModel getAllValuesById(long id)
	{
		object = users.get(id);
		
		if(object == null)
		{	
			throw new DataNotFoundException("Message with id : "+id+" not found!");
		}
		
		return object;
	}
	
	public CustomerModel addUser(CustomerModel object)
	{
		object.setId(users.size()+1);
		users.put(object.getId(), object);
		return object;
	}

	public CustomerModel updateUser(CustomerModel object) 
	{
		if(object.getId() <= 0)
		{
			throw new DataNotFoundException("Cannot update record, Invalid id : " +
					object.getId());
		}
		
		users.put(object.getId(), object);
		return object;
	}

	public CustomerModel removeUser(long id) 
	{
		if(id <= 0)
		{
			throw new DataNotFoundException("Cannot delete record, Invalid id : " + id);
		}
		
		return users.remove(id);
	}
}