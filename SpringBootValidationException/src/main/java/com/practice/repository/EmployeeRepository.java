package com.practice.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice.dto.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	
}
