package com.service;

import java.net.MalformedURLException;
import java.rmi.RemoteException;

import org.apache.axis.AxisFault;

public class TestClient {

	public static void main(String[] args) throws MalformedURLException, RemoteException {
		// TODO Auto-generated method stub

		
		java.net.URL endpointurl = new java.net.URL("http://localhost:8080/MyFirstWebService/services/CalService");
		
		
		org.apache.axis.client.Service service = new org.apache.axis.client.Service();
		
		
		CalServiceSoapBindingStub stub = new CalServiceSoapBindingStub(endpointurl,service);
		
	
		
		int result = stub.add(10, 10);
		
		System.out.println("Add result" + result);
		
		
		
	}

}
