package com.test.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CustomerDetails {

	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long customerId;

    private String address;

    private String phone;

    private LocalDate dateOfBirth;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public CustomerDetails(Long id, Long customerId, String address, String phone, LocalDate dateOfBirth) {
		super();
		this.id = id;
		this.customerId = customerId;
		this.address = address;
		this.phone = phone;
		this.dateOfBirth = dateOfBirth;
	}
    
    public CustomerDetails() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "CustomerDetails [id=" + id + ", customerId=" + customerId + ", address=" + address + ", phone=" + phone
				+ ", dateOfBirth=" + dateOfBirth + "]";
	}
    
    
}
