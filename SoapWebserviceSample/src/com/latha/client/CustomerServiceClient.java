package com.latha.client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.latha.model.Customer;
import com.latha.soap.CustomerService;

public class CustomerServiceClient {

	
	public static void main(String a[]) throws MalformedURLException{
	 Service calculatorService = Service.create(
                         new URL("http://10.0.0.181:5555/ws/customer?wsdl"),
             new QName("http://latha.soap.example", "CustomerService"));

    

     CustomerService customerService = calculatorService.getPort(CustomerService.class);
    Customer customer=customerService.getCustomer(1);
    System.out.println(customer.getName());
}

}