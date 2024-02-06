package com.example.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.dto.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	
}
