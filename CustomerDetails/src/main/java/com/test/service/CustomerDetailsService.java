package com.test.service;

import java.util.List;

import com.test.entity.CustomerDetails;

public interface CustomerDetailsService {

	public CustomerDetails AddCustomerDetailsService(CustomerDetails c1);
	public CustomerDetails GetCustomerDetailsService(long id);
	public List<CustomerDetails> GetAllCustomerDetailsService();
	public List<CustomerDetails> DeleteCustomerDetailsService(long id) ;
	public List<CustomerDetails>findByCustomerDetailsService(long customerId);

}