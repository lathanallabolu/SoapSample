package com.latha.soap;

import javax.xml.ws.Endpoint;



public class CustomerServicePublish {
	public static void main(String[] args) {  
		Endpoint endpoint=Endpoint.publish("http://10.0.0.181:5555/ws/customer", new CustomerServiceImpl()); 
		
		System.out.println(endpoint.isPublished());
		 } 
}
