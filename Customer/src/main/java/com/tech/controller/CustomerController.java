package com.tech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tech.entity.Customer;
import com.tech.service.CustomerServiceImp;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	
	public CustomerController() {
		System.out.println("Inside StudentController");
	}
	
	@Autowired
	private CustomerServiceImp customerServiceImp;
	
	
	@PostMapping("/")
	public Customer AddCustomer(@RequestBody Customer c) {
		return  customerServiceImp.addCustomer(c);
	}
	
	@GetMapping("/")
	public List<Customer>GetAllCustomer(){
		
		return customerServiceImp.getAllCustomer();
	}
	@DeleteMapping("/delete/{id}")
	public List<Customer>DeleteCustomer(@PathVariable Long id){
		return customerServiceImp.deleteCustomer(id);
	}
	
	@GetMapping("/getone/{id}")
	public Customer getCustomer(@PathVariable Long id) {
		return  customerServiceImp.getCustomer(id);
	}
}
