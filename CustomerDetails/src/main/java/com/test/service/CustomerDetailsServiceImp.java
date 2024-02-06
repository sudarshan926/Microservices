package com.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.Dao.CustomerDetailsDAO;
import com.test.entity.CustomerDetails;
@Service
public class CustomerDetailsServiceImp implements CustomerDetailsService {
	
	@Autowired
	private  CustomerDetailsDAO dao;
	
	public CustomerDetails AddCustomerDetailsService(CustomerDetails c1) {
		// TODO Auto-generated method stub
		return dao.save(c1);
	}

	public CustomerDetails GetCustomerDetailsService(long id) {
		
		return dao.findById(id).orElseThrow(()-> new RuntimeException());
	}

	public List<CustomerDetails> GetAllCustomerDetailsService() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	public List<CustomerDetails> DeleteCustomerDetailsService(long id) {
		// TODO Auto-generated method stub
			dao.deleteById(id);
			return dao.findAll();
	}
	
	public List<CustomerDetails>findByCustomerDetailsService(long customerId){
		return dao.findBycustomerId(customerId);
		
	}


}