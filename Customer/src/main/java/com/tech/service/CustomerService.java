package com.tech.service;

import java.util.List;
import java.util.Optional;

import com.tech.entity.Customer;

public interface CustomerService {
	
	public Customer addCustomer(Customer c);
	public List<Customer>deleteCustomer(Long id);
	public List<Customer>getAllCustomer();
	public Customer getCustomer(Long id);

}
