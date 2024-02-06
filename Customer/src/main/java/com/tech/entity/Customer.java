package com.tech.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Customer {

	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	
	private String email;
	
	private String password;
	
transient private List<CustomerDetails>CustomerDetails;
	
	

	public Customer(Long id, String name, String email, String password,
			List<com.tech.entity.CustomerDetails> customerDetails) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		CustomerDetails = customerDetails;
	}

	public List<CustomerDetails> getCustomerDetails() {
		return CustomerDetails;
	}

	public void setCustomerDetails(List<CustomerDetails> customerDetails) {
		CustomerDetails = customerDetails;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password
				+ ", CustomerDetails=" + CustomerDetails + "]";
	}
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
}
