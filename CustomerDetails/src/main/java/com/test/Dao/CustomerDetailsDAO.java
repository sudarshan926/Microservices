package com.test.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.entity.CustomerDetails;

@Repository
public interface CustomerDetailsDAO extends JpaRepository<CustomerDetails, Long> {
	public List<CustomerDetails>findBycustomerId(Long customerId);

}
