package com.latha.soap;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.latha.model.Customer;

@WebService(portName = "CustomerPort",
serviceName = "CustomerService",
targetNamespace = "http://latha.soap.example",
endpointInterface = "com.latha.soap.CustomerService")
public class CustomerServiceImpl {

	@WebMethod
    public Customer getCustomer(int id) {
		
		Customer customer=new Customer();
		customer.setId(id);
		customer.setAddress("1204 E algonquin rd");
		customer.setName("latha");
        return customer;
    }
	
}
