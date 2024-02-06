package com.tech.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.entity.Customer;
import com.tech.repository.CustomerRespo;

@Service
public class CustomerServiceImp implements CustomerService {
	
	@Autowired
	private CustomerRespo customerRespo;
	@Autowired
	private FignClient client;

	@Override
	public Customer addCustomer(Customer c) {
		// TODO Auto-generated method stub
		return customerRespo.save(c);
	}

	@Override
	public List<Customer> deleteCustomer(Long id) {
		customerRespo.deleteById(id);
		return customerRespo.findAll();
	}

	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		List<Customer> customers=customerRespo.findAll();
		
	  List<Customer> newcustomerList=	customers.stream().map(cust-> {
			cust.setCustomerDetails(client.getCustomerOfcustomerDetails(cust.getId()));
			return cust;
		}).collect(Collectors.toList());
	
		return  newcustomerList;
		
	}

	public Customer getCustomer(Long id) {
		
		Customer cs=	customerRespo.findById(id).orElseThrow(()-> new RuntimeException());
		cs.setCustomerDetails(client.getCustomerOfcustomerDetails(cs.getId()));
		return cs;
	}	
	
}
