package com.latha.soap;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style; 
import com.latha.model.Customer;
@WebService
@SOAPBinding(style = Style.RPC)  
public interface CustomerService {
    
	@WebMethod
	Customer getCustomer(int id);

}