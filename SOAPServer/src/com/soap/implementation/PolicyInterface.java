package com.soap.implementation;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import com.soap.exception.MyCustomException;
import com.soap.model.Customer;
import com.soap.model.Policy;

@WebService(name="PolicyInformationService", targetNamespace="http://localhost:8080/PolicyInformationService")
@SOAPBinding(style=Style.DOCUMENT)
public interface PolicyInterface 
{
	@WebMethod
	@WebResult(name="userDetails")
	public List<Customer> getAllUserDetails();
	
	@WebMethod
	@WebResult(name="policyDetails")
	public List<Policy> getAllPolicyDetails();
	
	@WebMethod
	@WebResult(name="userDetails")
	public Customer getUserById(@WebParam(name="userId") long id) throws MyCustomException;
	
	@WebMethod
	@WebResult(name="policyDetails")
	public Policy getPolicyById(@WebParam(name="policyNumber") long id) throws MyCustomException;
	
	@WebMethod
	@WebResult(name="userDetails")
	public Customer getUserByName(@WebParam(name="username") String username) throws MyCustomException;
	
	@WebMethod
	@WebResult(name="policyDetails")
	public Policy getPolicyByName(@WebParam(name="policyname") String policyname) throws MyCustomException;
}