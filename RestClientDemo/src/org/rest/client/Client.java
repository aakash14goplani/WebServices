package org.rest.client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class Client 
{
	String uri = "http://localhost:8080/RestApiDemo/hartford/user";
	URL url = null;
	HttpURLConnection connection = null;
	
	public static void main(String[] args) 
	{
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			Client object = new Client();
			int input;
			
			do
			{
				System.out.print("\nMenu\n1. GET All Details\n2. GET Details by id"
						+ "\n3. POST Add User\n4. PUT Update Details\n5. GET Policy Details"
						+ " id\n6. POST Add Policy\n7. PUT Update Policy Details\n8. GET by"
						+ " Attributes\n9. Exit\n Enter your option : ");
				input = Integer.parseInt(br.readLine());
				
				switch(input)
				{
					case 1 : object.getRequest(object.url, object.uri);
						 	 break;
						 	 
					case 2 : object.getRequestId(object.url, object.uri);
							 break;
							 
					case 3 : object.postAddUser(object.url, object.uri);
					 		 break;
					 		 
					case 4 : object.updateAddUser(object.url, object.uri);
							 break;
					
					case 5 : object.policyDetails(object.url, object.uri);
							 break;
							 
					case 6 : object.postAddPolicy(object.url, object.uri);
					 		 break;
					 
					case 7 : object.putUpdatePolicy(object.url, object.uri);
					 		 break;
					 		 
					case 8 : object.getAttributes(object.url, object.uri);
			 		 		 break;
					
					case 9 : break;
						 	 
					default : System.out.println("Invalid Option : "+input); 
							  break;
				}
			}
			while(input != 9);
		}
		catch (Exception e) 
		{
			System.out.println("Exception Occoured "+e);
		}
	}

	public void getRequest(URL url, String uri)
	{
		try
		{
			url = new URL(uri);
			connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.setRequestProperty("Accept", "application/xml");
			
			if(connection.getResponseCode() != 200)
			{
				String error = "\nHTTP status code : "+ connection.getResponseCode();
				System.out.println(error);
			}
			
			BufferedReader br = new BufferedReader(new InputStreamReader
					(connection.getInputStream()));
			
			String output = "";
			System.out.println("Output from Server : ");
			while((output = br.readLine()) != null)
			{
				System.out.println(output);
			}
			
			connection.disconnect();
		}
		catch (Exception e) 
		{
			System.out.println("Exception Occoured "+e);
		}
	}
	
	public void getRequestId(URL url, String uri)
	{
		try
		{
			BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("\nEnter id : ");
			long id = Long.parseLong(br2.readLine());
			uri = uri+"/"+id;
			
			url = new URL(uri);
			connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.setRequestProperty("Accept", "application/json");
			
			if(connection.getResponseCode() != 200)
			{
				String error = "\nHTTP status code : "+ connection.getResponseCode();
				System.out.println(error);
			}
			
			BufferedReader br = new BufferedReader(new InputStreamReader
					(connection.getInputStream()));
			
			String output = "";
			System.out.println("Output from Server : ");
			while((output = br.readLine()) != null)
			{
				System.out.println(output);
			}
			
			connection.disconnect();
		}
		catch (Exception e) 
		{
			System.out.println("Exception Occoured "+e);
		}
	}
	
	public void postAddUser(URL url, String uri) 
	{
		try
		{
			url = new URL(uri);
			connection = (HttpURLConnection) url.openConnection();
			connection.setDoOutput(true);
			connection.setRequestMethod("POST");
			connection.setRequestProperty("Content-Type", "application/json");
			
			BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
			String policy = "", name = "", role = "";
			long tenure;
			
			System.out.print("\nhartFordTenureMonths : ");
			tenure = Long.parseLong(br2.readLine());
			System.out.print("policyAssociated : ");
			policy = br2.readLine();
			System.out.print("userName : ");
			name = br2.readLine();
			System.out.print("userRole : ");
			role = br2.readLine();
			
			String input = "{\"hartFordTenureMonths\":"+tenure+","
					+ "\"policyAssociated\":\""+policy+"\","
					+ "\"userName\":\""+name+"\","
					+ "\"userRole\":\""+role+"\"}";
			
			OutputStream os = connection.getOutputStream();
			os.write(input.getBytes());
			os.flush();
			
			if(connection.getResponseCode() != HttpURLConnection.HTTP_CREATED)
			{
				String error = "\nHTTP status code : "+ connection.getResponseCode();
				System.out.println(error);
			}
			
			BufferedReader br = new BufferedReader(new InputStreamReader
					(connection.getInputStream()));
			
			String output = "";
			System.out.println("Output from Server : ");
			while((output = br.readLine()) != null)
			{
				System.out.println(output);
			}
			
			connection.disconnect();
		}
		catch (Exception e) 
		{
			System.out.println("Exception Occoured "+e);
		}
	}

	public void updateAddUser(URL url, String uri) 
	{
		try
		{
			BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("\nEnter id : ");
			long id = Long.parseLong(br2.readLine());
			uri = uri+"/"+id;
			
			url = new URL(uri);
			connection = (HttpURLConnection) url.openConnection();
			connection.setDoOutput(true);
			connection.setRequestMethod("PUT");
			connection.setRequestProperty("Content-Type", "application/json");
			
			String policy = "", name = "", role = "";
			long tenure;
			
			System.out.print("\nhartFordTenureMonths : ");
			tenure = Long.parseLong(br2.readLine());
			System.out.print("policyAssociated : ");
			policy = br2.readLine();
			System.out.print("userName : ");
			name = br2.readLine();
			System.out.print("userRole : ");
			role = br2.readLine();
			
			String input = "{\"hartFordTenureMonths\":"+tenure+","
					+ "\"id\":"+id+","
					+ "\"policyAssociated\":\""+policy+"\","
					+ "\"userName\":\""+name+"\","
					+ "\"userRole\":\""+role+"\"}";
			
			OutputStream os = connection.getOutputStream();
			os.write(input.getBytes());
			os.flush();
			
			if(connection.getResponseCode() != HttpURLConnection.HTTP_CREATED)
			{
				String error = "\nHTTP status code : "+ connection.getResponseCode();
				System.out.println(error);
			}
			
			BufferedReader br = new BufferedReader(new InputStreamReader
					(connection.getInputStream()));
			
			String output = "";
			System.out.println("Output from Server : ");
			while((output = br.readLine()) != null)
			{
				System.out.println(output);
			}
			
			connection.disconnect();
		}
		catch (Exception e) 
		{
			System.out.println("Exception Occoured "+e);
		}
	}

	public void policyDetails(URL url, String uri) 
	{
		try
		{
			BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("\nEnter id : ");
			long id = Long.parseLong(br2.readLine());
			uri = uri+"/"+id+"/policy";
			
			url = new URL(uri);
			connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.setRequestProperty("Accept", "application/json");
			
			if(connection.getResponseCode() != 200)
			{
				String error = "\nHTTP status code : "+ connection.getResponseCode();
				System.out.println(error);
			}
			
			BufferedReader br = new BufferedReader(new InputStreamReader
					(connection.getInputStream()));
			
			String output = "";
			System.out.println("Output from Server : ");
			while((output = br.readLine()) != null)
			{
				System.out.println(output);
			}
			
			connection.disconnect();
		}
		catch (Exception e) 
		{
			System.out.println("Exception Occoured "+e);
		}	
	}
		
	public void postAddPolicy(URL url, String uri) 
	{
		try
		{
			BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("\nEnter User id : ");
			long policyNumber = Long.parseLong(br2.readLine());
			uri = uri+"/"+policyNumber+"/policy";
			
			url = new URL(uri);
			connection = (HttpURLConnection) url.openConnection();
			connection.setDoOutput(true);
			connection.setRequestMethod("POST");
			connection.setRequestProperty("Content-Type", "application/json");
			
			String policyStatus = "", policyType = "", username = "";
			long tenure;
			
			System.out.print("\npolicyStatus : ");
			policyStatus = br2.readLine();
			System.out.print("policyTenure : ");
			tenure = Long.parseLong(br2.readLine());
			System.out.print("policyType : ");
			policyType = br2.readLine();
			System.out.print("username : ");
			username = br2.readLine();
			
			String input = "{\"policyNumber\":"+policyNumber+","
					+ "\"policyStatus\":\""+policyStatus+"\","
					+ "\"policyTenure\":"+tenure+","
					+ "\"policyType\":\""+policyType+"\","
					+ "\"username\":\""+username+"\"}";
			
			OutputStream os = connection.getOutputStream();
			os.write(input.getBytes());
			os.flush();
			
			if(connection.getResponseCode() != HttpURLConnection.HTTP_CREATED)
			{
				String error = "\nHTTP status code : "+ connection.getResponseCode();
				System.out.println(error);
			}
			
			BufferedReader br = new BufferedReader(new InputStreamReader
					(connection.getInputStream()));
			
			String output = "";
			System.out.println("Output from Server : ");
			while((output = br.readLine()) != null)
			{
				System.out.println(output);
			}
			
			connection.disconnect();
		}
		catch (Exception e) 
		{
			System.out.println("Exception Occoured "+e);
		}	
	}
	
	public void putUpdatePolicy(URL url, String uri) 
	{
		try
		{
			BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("\nEnter User id : ");
			long policyNumber = Long.parseLong(br2.readLine());
			uri = uri+"/"+policyNumber+"/policy/"+policyNumber;
			
			url = new URL(uri);
			connection = (HttpURLConnection) url.openConnection();
			connection.setDoOutput(true);
			connection.setRequestMethod("PUT");
			connection.setRequestProperty("Content-Type", "application/json");
			
			String policyStatus = "", policyType = "", username = "";
			long tenure;
			
			System.out.print("\npolicyStatus : ");
			policyStatus = br2.readLine();
			System.out.print("policyTenure : ");
			tenure = Long.parseLong(br2.readLine());
			System.out.print("policyType : ");
			policyType = br2.readLine();
			System.out.print("username : ");
			username = br2.readLine();
			
			String input = "{\"policyNumber\":"+policyNumber+","
					+ "\"policyStatus\":\""+policyStatus+"\","
					+ "\"policyTenure\":"+tenure+","
					+ "\"policyType\":\""+policyType+"\","
					+ "\"username\":\""+username+"\"}";
			
			OutputStream os = connection.getOutputStream();
			os.write(input.getBytes());
			os.flush();
			
			if(connection.getResponseCode() != HttpURLConnection.HTTP_CREATED)
			{
				String error = "\nHTTP status code : "+ connection.getResponseCode();
				System.out.println(error);
			}
			
			BufferedReader br = new BufferedReader(new InputStreamReader
					(connection.getInputStream()));
			
			String output = "";
			System.out.println("Output from Server :");
			while((output = br.readLine()) != null)
			{
				System.out.println(output);
			}
			
			connection.disconnect();
		}
		catch (Exception e) 
		{
			System.out.println("Exception Occoured "+e);
		}
	}
	
	public void getAttributes(URL url2, String uri2) 
	{
		try
		{
			BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("\nfirst parameter : ");
			long one = Long.parseLong(br2.readLine());
			System.out.print("second parameter parameter : ");
			long second = Long.parseLong(br2.readLine());
			uri = uri+"?start="+one+"&size="+second;
			
			url = new URL(uri);
			connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.setRequestProperty("Accept", "application/json");
			
			if(connection.getResponseCode() != 200)
			{
				String error = "\nHTTP status code : "+ connection.getResponseCode();
				System.out.println(error);
			}
			
			BufferedReader br = new BufferedReader(new InputStreamReader
					(connection.getInputStream()));
			
			String output = "";
			System.out.println("Output from Server : ");
			while((output = br.readLine()) != null)
			{
				System.out.println(output);
			}
			
			connection.disconnect();
		}
		catch (Exception e) 
		{
			System.out.println("Exception Occoured "+e);
		}
	}
}