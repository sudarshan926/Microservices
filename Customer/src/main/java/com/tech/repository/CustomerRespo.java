package com.tech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tech.entity.Customer;

@Repository
public interface CustomerRespo extends JpaRepository<Customer, Long> {
	

 }