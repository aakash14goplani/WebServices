package org.aakash;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;
import net.webservicex.GeoIPServiceSoap;

public class IPLocationFinder 
{
	public static void main(String[] args)
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try
		{
			System.out.print("Enter IP Address : ");
			String ipAddress = br.readLine();
			
			//creating a service defined in WSDL
			GeoIPService geoIpService = new GeoIPService(); 
			
			//creating a port defined in WSDL
			GeoIPServiceSoap geoIpServiceSoap = geoIpService.getGeoIPServiceSoap(); 
			
			//calling method of port(intermediate object), this actually calls the webservice
			//takes i/p arg and return response
			GeoIP geoIp = geoIpServiceSoap.getGeoIP(ipAddress);
			
			String countryName = geoIp.getCountryName();
			String code = geoIp.getCountryCode();
			String ip = geoIp.getIP();
			System.out.println(ip+"\n"+countryName+"\n"+code);
		}
		catch(Exception e)
		{
			System.out.println("Exception Occured : "+e);
		}
	}
}